package com.testNG;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("homepage Test");
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageinfoTest() {
		System.out.println("home page info test");
	}

}
