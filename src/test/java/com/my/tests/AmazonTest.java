package com.my.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	
	public static String TITLE = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	
	@Test(priority = 1)
	public void amazonTitleTest() {
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println("the page title: " +title);
		Assert.assertEquals(title, AmazonTest.TITLE);
		
	}
	@Test(priority = 2)
	public void amazonUrlTest() {
		driver.get("https://www.amazon.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));
	}
	@Test(priority = 3)
	public void AmazonLinkPresentTest() {
		driver.get("https://www.amazon.com/");
		boolean b = driver.findElement(By.linkText("Best Sellers")).isDisplayed();
		Assert.assertTrue(b);
		//Assert.assertTrue(driver.findElement(By.linkText("Best Sellers")).isDisplayed());
	
	}
	
}
