package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class customXpath {
	
	//static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	//	String checkBox_xpath = "//span[text()='Rad Ram']"
	//			+"//ancestor::td//preceding-sibling::td//input[@type='checkbox']//parent::span";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(10000);
		driver.findElement(By.id("username")).sendKeys("radhika1rama@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("hiTesting157");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(6000);
		driver.navigate().to("https://app.hubspot.com/contacts/8883580/contacts/list/view/all/");
		
		
		}

}
