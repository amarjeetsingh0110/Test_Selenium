package com.fft.selenium.framework;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTesting {

	
	@BeforeTest
	public void driverCreation()
	{
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
		Assert.fail();	
		System.out.println("=============>>>Performing Login...!!!");
	}
	
	@Test(priority=2)
	public void userSignUp()
	{
		Assert.fail();
		System.out.println("==========>>>Filling up User Registration form for Signing Up.");
		
		//login();
		//validatingFunctionality();
	}
	
	@BeforeMethod
	public void browserLaunch()
	{
		System.out.println("=======>>>Launching the Browser...!!!");
	}
	
	@Test (priority=4, dependsOnMethods="login")
	public void validatingFunctionality()
	{
		System.out.println("================>>>Validating the Search Functionality on Home Page.");
	}
	
	@AfterMethod
	public void browserClose()
	{
		System.out.println("===================>>>Closing the Browser\n");
	}
	
	
	
}
