package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
   static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		WebElement un = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		un.sendKeys("radhika1rama@gmail.com");
		waitForElementLocated(emailId, 10).sendKeys("radhika1rama@gmail.com");
		waitForElementLocated(pwd, 10).sendKeys("Selenium$1357");
		
		//driver.findElement(By.id("input-password")).sendKeys("Selenium$1357");
		driver.findElement(By.xpath("//input[@value='Login' and @type='submit']")).click();
	}
	public static WebElement waitForElementLocated(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

}
