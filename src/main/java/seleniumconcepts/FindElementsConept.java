package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//find total no of links
		
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		// find text of each link
		
		for(int i=0;i<linklist.size();i++) {
			String text = linklist.get(i).getText();
			//ignore the blank test
			
			if(!text.isEmpty()) {
				System.out.println(i + "--->" + text);
			}
		}
		
		
	}

}
