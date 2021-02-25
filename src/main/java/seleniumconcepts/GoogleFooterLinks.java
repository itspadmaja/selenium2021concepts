package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooterLinks {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		//div[@class='KxwPGc AghGtd']/a
		 List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		 System.out.println("total footer links : " + footerLinks.size());
		 for(WebElement e : footerLinks) {
			 String text = e.getText();
			 System.out.println(text);
			 
			 if(text.equals("Business")) {
				e.click(); 
				break;
			 }
		 }
		 
	}

}
