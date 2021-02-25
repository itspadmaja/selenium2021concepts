package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(driver.getTitle());
		WebElement url_ele = driver.findElement(By.id("Form_submitForm_subdomain"));
		url_ele.sendKeys("naveenautomationlabs.com");//v1--e1 [selenium internally creates one webelement id
		
		driver.navigate().refresh();//StaleElementReferenceException
		//v2--DOM
		url_ele = driver.findElement(By.id("Form_submitForm_subdomain"));
		url_ele.sendKeys("naveenautomationlabs.com");//v2--e2
		//Stale = rotten, element got staled bcause new version of DOM is updated, 
		//stale element reference: element is not attached to the page document
		//to overcome this problem, create the webelement again after refresh ,back,forward, that means whenever page is reloaded, 
	}

}
