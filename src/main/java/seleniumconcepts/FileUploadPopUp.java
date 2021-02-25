package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//type = file should be there for any choose file or upload popup/browse popup
		WebElement fileupload = driver.findElement(By.name("upfile"));
		fileupload.sendKeys("C:\\Users\\Padmaja Prasad\\Documents\\dignity health\\search speciality.JPG");
		

	}

}
