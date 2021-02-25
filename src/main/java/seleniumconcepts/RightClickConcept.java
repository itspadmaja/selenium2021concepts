package seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(rightClickele).perform();
		////ul/li[contains(@class,'context-menu-item context-menu-icon')]
		List<WebElement> rightclickList = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item context-menu-icon')]"));
		System.out.println(rightclickList.size());
		for(int i=0;i<rightclickList.size();i++) {
			String text = rightclickList.get(i).getText();
			System.out.println(text);
			
			if(text.equals("Edit")) {
				rightclickList.get(i).click();
				
				break;
			}
			
		}
	}

}
