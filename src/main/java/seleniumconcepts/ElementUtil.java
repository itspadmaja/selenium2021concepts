package seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	public static By getLocator(String value) {
		return By.id(value);
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	public  void  doActionSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	public  void doActionClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	public int getElementCount(String tagName) {
		return driver.findElements(By.tagName(tagName)).size();
	}
	public  List<String> getAttributeList(String tagName , String attributeName) {
		
		List<String> elelist = new ArrayList<String>();
		List<WebElement> attrList = driver.findElements(By.tagName(tagName));
		
		for(WebElement e : attrList) {
			
			String text = e.getAttribute(attributeName);
			elelist.add(text);
			
		}
		return elelist;
	}
	public void doClickFromList(By locator,String linkText) {
		List<WebElement> footerLinks = getElements(locator);
		for(int i=0; i<footerLinks.size(); i++) {
		String text = footerLinks.get(i).getText();
		System.out.println(text);
		if(text.equals(linkText)) {
			footerLinks.get(i).click();
			break;
		}
		}
		
		
	}
	//**********************************Select class drop down utils
    public void doSelectDropDownByText(By locator , String text) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
    public void doSelectDropDownByIndex(By locator , int index) {
		
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);;
	}
    public void doSelectDropDownByValue(By locator , String value) {
		
		Select select = new Select(getElement(locator));
		select.selectByValue(value);;
	}
    public  List<String> doDropDownOptions(By locator) {
		
		Select select = new Select(getElement(locator));
		List<String> optionListText = new ArrayList<String>();
		List<WebElement>optionsList = select.getOptions();
		for(WebElement ele : optionsList) {
			optionListText.add(ele.getText());
			
		}
		return optionListText;
	}
    public void doDropDownWithoutSelectClass(By locator, String value) {
		List<WebElement> Options_List = getElements(locator);
		System.out.println(Options_List.size());
		for(WebElement e: Options_List) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	

}
