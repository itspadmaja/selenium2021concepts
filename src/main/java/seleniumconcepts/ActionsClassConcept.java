package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By login = By.xpath("//input[@value='Login' and @type='submit']");
		
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(emailId), "radhika1rama@gmail.com").perform();
		action.sendKeys(driver.findElement(pwd), "Selenium$1357").perform();
		action.sendKeys(Keys.ENTER);
		
		
//		  doActionSendKeys(emailId, "radhika1rama@gmail.com"); 
//		  doActionSendKeys(pwd,"Selenium$1357");
//		  doActionClick(login);
		 
		// doActionSendKeyswithMoveToEle(emailId , "radhika1rama@gmail.com");
		// doActionSendKeyswithMoveToEle(pwd , "Selenium$1357");
		// doActionClickwithMoveToEle(login);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}

	public static void doActionClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}

	// not working
	public static void doActionSendKeyswithMoveToEle(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}

	public static void doActionClickwithMoveToEle(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click().build().perform();
	}

}
