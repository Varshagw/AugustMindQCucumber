package mindq.seleniumtrainingaugframework.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	public void launchBrowser(String browser) {
		
		
		if(browser.equals("Chrome")) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://studio.cucumber.io/users/sign_in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		}else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://studio.cucumber.io/users/sign_in");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		}
		
		

	}

	
	public void closeBrowser() {
		driver.close();
	}
}
