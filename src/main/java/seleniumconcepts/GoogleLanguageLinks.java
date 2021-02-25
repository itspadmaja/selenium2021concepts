package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
         static WebDriver driver;
         
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 
		 ////div[@class='szppmdbYutt__middle-slot-promo']/a
		 
		 List<WebElement> googleLinks = driver.findElements(By.xpath("//div[@class='szppmdbYutt__middle-slot-promo']/a"));
		 System.out.println(googleLinks.size());
		 for(WebElement e : googleLinks) {
			String text = e.getText();
			System.out.println(text);
			e.click();
			driver.navigate().back();
			
			ElementUtil ele = new ElementUtil(driver);
			
			List<String> image = ele.getAttributeList("img", "src");
			System.out.println(image.size());
			for(String s : image) {
				System.out.println(s);
			}
			if(!image.isEmpty()){
				System.out.println(" image is present");
			}
			else {
				System.out.println("image is not present");
			}
			
			
			
			}
			
			
		 }

	}



