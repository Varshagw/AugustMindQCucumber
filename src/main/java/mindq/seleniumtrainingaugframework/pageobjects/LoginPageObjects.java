package mindq.seleniumtrainingaugframework.pageobjects;

import org.openqa.selenium.By;

import mindq.seleniumtrainingaugframework.base.Base;

public class LoginPageObjects extends Base {

	public By loginLink = By.linkText("Login");

	public By emailIdInputBox = By.id("user_email");

	public By passwordInputBox = By.name("user[password]");

	public By signinButton = By.name("commit");
	
	public By invalidErrorMessage = By.tagName("h2");

	public void clickLogin() {

		try {
			driver.findElement(loginLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterEmailId(String email) {
		try {
			driver.findElement(emailIdInputBox).clear();
			driver.findElement(emailIdInputBox).sendKeys(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		try {
			driver.findElement(passwordInputBox).clear();
			driver.findElement(passwordInputBox).sendKeys(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickSignin() {

		try {
			driver.findElement(signinButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public boolean errorMessagePresence() {
		
		boolean result = false;
		
		try {
			result = driver.findElement(invalidErrorMessage).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
		
	}
}
