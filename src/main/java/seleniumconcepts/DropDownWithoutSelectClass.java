package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By optionsList = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
//		List<WebElement> industry_Options = driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
//		System.out.println(industry_Options.size());
//		for(WebElement e: industry_Options) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Aerospace")) {
//				e.click();
//			}
//		}
		
		doDropDownWithoutSelectClass(optionsList,"Finance/ Banking / Insurance / Real Estate / Legal");
		
		
	}
	public static void doDropDownWithoutSelectClass(By locator, String value) {
		List<WebElement> industry_Options = driver.findElements(locator);
		System.out.println(industry_Options.size());
		for(WebElement e: industry_Options) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
