package seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableAssignment {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		////a[text()='Mohammad Irfan']//parent::td//following-sibling::td
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/psl-2020-21-1238103/multan-sultans-vs-peshawar-zalmi-5th-match-1247015/full-scorecard");
		Thread.sleep(4000);
		
		System.out.println(getPlayerScoreList("Mohammad Irfan"));
		System.out.println(getPlayerScoreList("Mohammad Imran"));
		System.out.println(getPlayerScoreList("Saqib Mahmood"));
		System.out.println(getPlayerScoreList("Mujeeb Ur Rahman"));
		System.out.println(getPlayerScoreList("Wahab Riaz"));
		
		
	}
	public static List<String> getPlayerScoreList(String playerName) {
		System.out.println("Score list for : " + playerName);
		List<String> BowlingScoreList = new ArrayList<String>();
		List<WebElement>scoreCardList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td"));
		for(WebElement e : scoreCardList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				BowlingScoreList.add(text);
			}
			
		}
		return BowlingScoreList;
	}

}
