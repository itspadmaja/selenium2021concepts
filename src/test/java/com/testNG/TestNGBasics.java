package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//testNG = test Next Generation
	// TestNG- Unit testing Framework
	//Annotations are used to write test cases
	// testNG is  used to design, manage and run test cases
	//Pre conditions --test case steps(validation-( we use Assertions)Actual vs Expected )--Post Conditions
	//There are two types of Pre conditions - Global pre conditions and preconditions and PreRequisite is required to write the tc
	//Tests are executed on the basis of Alphabetical order
//	BS-----Connect to the database
//	BT-----create user in DB
//	BC-----launch the browser
	
//	BM-----login to the app
//	TC-----check user info
//	AM-------logout to the application
	
//	BM-----login to the app
//	TC-----check status of user
//	AM-------logout to the application
	
//	BM-----login to the app
//	TC-------Check User Profice
//	AM-------logout to the application
	
//	AC-------close the Browser
//	AT-----del the user
//	AS-----disconnect the database
//	
	@BeforeSuite
	public void connectDB(){
		System.out.println("BS-----Connect to the database");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT-----create user in DB");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-----launch the browser");
	}
	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM-----login to the app");
	}
	@Test
	public void checkUserInfo() {
		System.out.println("TC-----check user info");
	}
	@Test
	public void checkuserProfile() {
		System.out.println("TC-------Check User Profile");
	}
	@Test
	public void checkUserStatus() {
		System.out.println("TC-----check status of user");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM-------logout to the application");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-------close the Browser");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT-----del the user");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS-----disconnect the database");
	}

}
