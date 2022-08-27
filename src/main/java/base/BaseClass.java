package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void setup() {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("My browser is maximized");
	}

	public void tearDown() {
		driver.quit();
	}



}
