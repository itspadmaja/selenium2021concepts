package com.my.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest extends BaseTest{
	
	public static String TITLE = "Google";
	
	@Test(priority = 1)
	public void GoogleTitleTest() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("the page title: " +title);
		Assert.assertEquals(title, GoogleTest.TITLE);
		
		
	}
	@Test(priority = 2)
	public void GoogleUrlTest() {
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
	}
	
	
}



