package seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
//		 List<WebElement>imagelist = driver.findElements(By.tagName("img"));
//		 System.out.println("total no of images: " +imagelist.size());
//		 for(WebElement s : imagelist) {
//			 System.out.println(s.getAttribute("src"));
//		 }
		 
		 System.out.println(getElementCount("img"));
		 System.out.println(getElementCount("a"));
		 
		 List<String> srcList = getAttributeList("img", "src");
		 for(String images : srcList) {
			 System.out.println(images);
		 }
		List<String> hrefList =getAttributeList("a" , "href");
		for(String links : hrefList) {
			System.out.println(links);
		}
		 
	}
	public static int getElementCount(String tagName) {
		return driver.findElements(By.tagName(tagName)).size();
	}
	public static List<String> getAttributeList(String tagName , String attributeName) {
		
		List<String> elelist = new ArrayList<String>();
		List<WebElement> attrList = driver.findElements(By.tagName(tagName));
		
		for(WebElement e : attrList) {
			
			String text = e.getAttribute(attributeName);
			elelist.add(text);
			
		}
		return elelist;
	}

}
