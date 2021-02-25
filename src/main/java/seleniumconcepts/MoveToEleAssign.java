package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToEleAssign {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		By signup = By.id("ctl00_HyperLinkLogin");
		By menu1 = By.linkText("SpiceClub Members");
		By menu2 = By.linkText("Member Login");
		
		WebElement menu = getElement(signup);
		Thread.sleep(3000);
		doMoveToElement(menu);
		WebElement submenu1 = getElement(menu1);
		Thread.sleep(3000);
		doMoveToElement(submenu1);
		getElement(menu2).click();
	
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doMoveToElement(WebElement  locator) {
		//getElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(locator).build().perform();
	}

}
