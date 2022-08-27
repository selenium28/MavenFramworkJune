package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.PIMPages;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestCaseRunClass extends BaseClass{
	LoginPage objLoginPage;
	PIMPages objPIMPages;
	

	@Test
	public void loginMethod() throws InterruptedException {
		
		String username = "Admin";
		String pass = "admin123";
		
		objLoginPage = new LoginPage();
		Thread.sleep(5000);
		objLoginPage.enterUserName(username);
		objLoginPage.enterPassword(pass);
		objLoginPage.clickLogin();
		
		String actual = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/";
//		String expected = "ABC";
		String expected = driver.getCurrentUrl();
		System.out.println("expected: " +expected);
//		if (actual.equals(expected)) {
//			System.out.println("test passed");
//			
//		} else {
//			System.out.println("test failed");
//		}
		
		Assert.assertEquals(actual, expected, "URL not matched");
	
		//(//*[text()='PIM'])[2]
		//*[text()='Employee Information']
		
	}
	
	@Test 
	public void pimMethod() {
		
		String empName = "Test123";
		
		objPIMPages = new PIMPages();
		objPIMPages.enterempName(empName);
		
		
	}
	
	@BeforeTest
	public void beforeTest() {
		setup();
	}

	@AfterTest
	public void afterTest() {
		tearDown();
	}

}
