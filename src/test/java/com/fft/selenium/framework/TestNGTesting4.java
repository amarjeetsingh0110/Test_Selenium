package com.fft.selenium.framework;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTesting4 {

	
	@BeforeTest
	public void driverCreation()
	{
		Reporter.log("Insidde userSignUp");
		System.out.println(">>>>>>>>>>>>>>>>> WebDriver Object Creation...!!! <<<<<<<<<<<<<<<<<<\n");

	}
	
	
	@AfterTest
	public void driverDestroy()
	{
		System.out.println(">>>>>>>>>>>>>>>>> WebDriver Object Destroy...!!! <<<<<<<<<<<<<<<<<<\n\n\n\n\n");

	}
	
	
	@Test(priority=3)
	public void login()
	{
		System.out.println("=============>>>Performing Login...!!!");
	}
	
	@Test(priority=2)
	public void userSignUp()
	{	
		Reporter.log("Inside userSignUp");
		Reporter.log("<a href=\"D:/Screenshots/screenshot.jpg\" target=\"_blank\">Screenshot Link</a>");
		//Reporter.log("<br></br>");
		Reporter.log("<a href=\"D:/Screenshots/screenshot.jpg\" target=\"_blank\"><img src=\"D:/Screenshots/screenshot.jpg\" height=100 width=200></a>");
		Assert.fail();
		System.out.println("==========>>>Filling up User Registration form for Signing Up.");
		
	}
	
	@BeforeMethod
	public void browserLaunch()
	{
		//throw new SkipException("Skip");
		//System.out.println("=======>>>Launching the Browser...!!!");
	}
	
	@Test(priority=5)
	public void validatingFunctionality()
	{
		System.out.println("================>>>Validating the Search Functionality on Home Page.");
	}
	
	@AfterMethod
	public void browserClose()
	{
		//throw new SkipException("Test Case Skipped");
		//System.out.println("===================>>>Closing the Browser\n");
	}
	
	
	
}
