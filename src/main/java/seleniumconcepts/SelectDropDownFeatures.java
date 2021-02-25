package seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownFeatures {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		Select industry_select = new Select(driver.findElement(industry));
//		List<WebElement> industryOptions = industry_select.getOptions();
//		System.out.println(industryOptions.size());
//		for(WebElement e: industryOptions) {
//			String optionList = e.getText();
//			System.out.println(optionList);
//		}
		List<String> industryList = doDropDownOptions(industry) ;
		List<String>countryList = doDropDownOptions(country) ;
		
		System.out.println("Industry options drop down list: " + industryList.size());
		System.out.println(industryList);
		System.out.println("Country options drop down list: " + countryList.size());
		System.out.println(countryList);
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<String> doDropDownOptions(By locator) {
		
		Select select = new Select(getElement(locator));
		List<String> optionListText = new ArrayList<String>();
		List<WebElement>optionsList = select.getOptions();
		for(WebElement ele : optionsList) {
			optionListText.add(ele.getText());
			
		}
		return optionListText;
	}

}
