package com.my.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooTest extends BaseTest{
	
	public static String TITLE = "Yahoo";
	
	@Test(priority = 1)
	public void yahooTitleTest() {
		driver.get("https://www.yahoo.com/");
		String title = driver.getTitle();
		System.out.println("the page title: " +title);
		Assert.assertEquals(title, YahooTest.TITLE);
		
		
	}
	@Test(priority = 2)
	public void yahooUrlTest() {
		driver.get("https://www.yahoo.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("yahoo"));
	}
	
	
}



