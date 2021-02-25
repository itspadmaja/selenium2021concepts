package com.testNG;

import org.testng.annotations.Test;

public class ExpectedConditions {
	
	String name;
	
	@Test(expectedExceptions = NullPointerException.class)
	public void loginTest() {
		System.out.println("login test");
		//int i = 9/0;
		System.out.println("bye");
		ExpectedConditions obj = new ExpectedConditions();
		obj = null;
		obj.name = "testing";
	}

}
