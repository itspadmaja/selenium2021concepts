package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iMac");
		Thread.sleep(4000);
		
		List<WebElement> suggestList = driver.findElements(By.xpath("//div[@class='s-suggestion']/span"));
	
		System.out.println(suggestList.size());
		for(WebElement e:suggestList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("keyboard")) {
				e.click();
				break;
			}
			
		}
		
		
	}

}
