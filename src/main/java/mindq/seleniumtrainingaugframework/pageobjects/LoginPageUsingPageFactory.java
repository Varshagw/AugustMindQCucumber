package mindq.seleniumtrainingaugframework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mindq.seleniumtrainingaugframework.base.Base;

public class LoginPageUsingPageFactory extends Base{
	

	
	@FindBy(linkText = "Login")
	public static WebElement loginLink;
	
	
	@FindBy(id = "user_email")
	public static WebElement emailIdInputBox;
	
	@FindBy(name = "user[password]")
	public static WebElement passwordInputBox;
	
	@FindBy(name = "commit")
	public static WebElement signinButton;
	
	@FindBy(tagName = "h2")
	public static WebElement invalidErrorMessage;
	
	public LoginPageUsingPageFactory(WebDriver driver) {
		
		Base.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clickLogin() {

		loginLink.click();
	}

	public void enterEmailId(String email) {
		emailIdInputBox.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordInputBox.sendKeys(password);
	}

	public void clickSignin() {

		signinButton.click();
	}

	
	public boolean errorMessagePresence() {
		
		boolean result = false;
		
		result = invalidErrorMessage.isDisplayed();
		
		
		
		return result;
		
	}

}
