package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PIMPages extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
	WebElement empName;
	
	public PIMPages() {
		PageFactory.initElements(driver, this);
	}

	public void enterempName(String name) {
		empName.sendKeys(name);
	}

}
