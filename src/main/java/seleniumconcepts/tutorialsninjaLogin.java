package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tutorialsninjaLogin {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("Chrome");
		br.launchUrl("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By login_btn = By.xpath("//input[@value='Login' and @type='submit']");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(emailId, "radhika1rama@gmail.com");
		ele.doSendKeys(pwd, "Selenium$1357");
		ele.doClick(login_btn);
		
		br.close();
		
		
	}

}
