package genric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunction {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/test/newtours/register.php";

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement country = driver.findElement(By.name("country"));
		clickOnWebElement(country, 5);
	}


	public static void clickOnWebElement(WebElement element, long waitTimeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, waitTimeInSeconds);  // Duration.ofSecond
		WebElement elements = null;
		elements = wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}

	public void sendKeysOnWebElements(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		
		Select select= new Select(element);
		select.selectByVisibleText(text);
		
	}
	
	public void accetAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void mouseAndClickElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

}
