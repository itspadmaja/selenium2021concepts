package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUps {

	public static void main(String[] args) {
		
		// for Authentication popus , we have to write username and password Within the url
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String username = "admin";
		String password ="admin";
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
	}

}
