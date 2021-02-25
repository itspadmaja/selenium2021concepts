package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	WebDriver driver;
	/**
	 * initializing the browser
	 * @param BrowserName
	 * @return driver
	 */
	public WebDriver init_driver(String BrowserName) {
		if(BrowserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("pass the correct browser name : " + BrowserName);
		}
		return driver;
	}
	/**
	 * launching url
	 * @param url
	 */
	public void launchUrl(String url) {
		System.out.println("the url is: " + url);
		driver.get(url);
	}
	/**
	 * navigate to method
	 */
	public void navigateTo(String url) {
		System.out.println(url);
		driver.navigate().to(url);
	}
	/**
	 * getTitle method
	 * @param title
	 * @return title
	 */
	public String getPageTitle() {
		System.out.println("The title : " );
		return driver.getTitle();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void close() {
		driver.close();
	}
	

}
