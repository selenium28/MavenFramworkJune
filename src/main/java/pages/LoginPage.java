package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
}
