package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("QA testing");
		Thread.sleep(4000);
		List<WebElement> searchList = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='sbl1']/span"));
		int count = searchList.size();
		System.out.println(count);
		for(WebElement ele : searchList) {
			String text = ele.getText();
			System.out.println(text);
			if(text.contains("jobs")) {
				ele.click();
				break;
			}
		}
		
	}

}
