package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
//		WebElement e_mail = driver.findElement(By.id("input-email"));
//		WebElement pwd = driver.findElement(By.id("input-password"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Login' and @type='submit']"));
//		e_mail.sendKeys("radhika1rama@gmail.com");
//		pwd.sendKeys("Selenium$1357");
//		login.click();
//		
		//BY Locators
//	By emailId = By.id("input-email");
//	By pwd = By.id("input-password");
//	By login_btn = By.xpath("//input[@value='Login' and @type='submit']");
	
//	WebElement email_ele = driver.findElement(emailId);
//	WebElement pwd_ele = driver.findElement(pwd);
//	WebElement loginBtn_ele = driver.findElement(login_btn);
//	
//	email_ele.sendKeys("radhika1rama@gmail.com");
//	pwd_ele.sendKeys("Selenium$1357");
//	loginBtn_ele.click();
	
	//getElement method
	
//	getElement(emailId).sendKeys("radhika1rama@gmail.com");
//	getElement(pwd).sendKeys("Selenium$1357");
//	getElement(login_btn).click();
	
//	doSendKeys(emailId,"radhika1rama@gmail.com");
//	doSendKeys(pwd,"Selenium$1357");
//	doClick(login_btn);
		
		// string approach
		
		String s1 = "input-email";
		String s2 = "input-password";
		String s3 = "//input[@value='Login' and @type='submit']";
		
		doSendKeys(getLocator(s1), "radhika1rama@gmail.com");
		doSendKeys(getLocator(s2), "Selenium$1357");
		doClick(By.xpath(s3));
		
		
	}
	
	
	public static By getLocator(String value) {
		return By.id(value);
	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
