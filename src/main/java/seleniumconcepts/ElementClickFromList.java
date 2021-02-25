package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementClickFromList {
static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.freshworks.com/");
		By footerLinks = By.xpath("//ul[@class='footer-nav']/li/a");
		 
		doClickFromList(footerLinks,"Investors");
		 
//		List<WebElement> footerLinks = driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
//		System.out.println( footerLinks.size());
//		
//		
		
//		for(int i=0;i<footerLinks.size();i++) {
//			String text = footerLinks.get(i).getText();
//			System.out.println(text);
//			if(text.equals("Investors")) {
//				footerLinks.get(i).click();
//				break;
//		}
//
//	}
	}
	public static void doClickFromList(By locator,String linkText) {
		List<WebElement> footerLinks = driver.findElements(locator);
		for(int i=0; i<footerLinks.size(); i++) {
		String text = footerLinks.get(i).getText();
		System.out.println(text);
		if(text.equals(linkText)) {
			footerLinks.get(i).click();
			break;
		}
		}
		
		
	}

}
