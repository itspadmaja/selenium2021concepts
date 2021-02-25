package seleniumconcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/psl-2020-21-1238103/multan-sultans-vs-peshawar-zalmi-5th-match-1247015/full-scorecard");
		Thread.sleep(4000);
		System.out.println("player name: "+getBatmanName("James Vince"));
		System.out.println("player name: "+getBatmanName("Chris Lynn"));
//		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='James Vince']//parent::td//following-sibling::td"));
//		for(int i = 1; i<scoreList.size();i++) {
//			String ScoreListText = scoreList.get(i).getText();
//			System.out.println(ScoreListText);
//		}
		
		System.out.println("Score Card List for Player: "+getScoreList("James Vince")) ;
		System.out.println("Score Card List for Player : "+getScoreList("Chris Lynn"));
		
	}
	public static String getBatmanName(String name) {
		String scorecard = driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td//following-sibling::td/span")).getText();
		return scorecard;
	}
	public static List<String> getScoreList(String playerName) {
		
		System.out.println("The Player name is "+playerName);
		
		List<String>scoreCardList = new ArrayList<String>();
	    
		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td"));
		for(int i = 1; i<scoreList.size();i++) {
			String ScoreListText = scoreList.get(i).getText();
			if(!ScoreListText.isEmpty()) {
				scoreCardList.add(ScoreListText);	
			}
			
	}
		return scoreCardList;
	
	
	
	}	

}
