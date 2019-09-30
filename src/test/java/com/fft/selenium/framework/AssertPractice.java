package com.fft.selenium.framework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {
	

	
	@Test
	public void Test1()
	{
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(true, true);
		//Assert.assertEquals(true, true);
		System.out.println("Executed Test Case : 1");
		soft.assertAll();
	}

	
	@Test
	public void Test2()
	{
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(true, true);
		//Assert.assertEquals(true, true);
		System.out.println("Executed Test Case : 2");
		soft.assertAll();
	}

	
	@Test
	public void Test3()
	{
		SoftAssert soft= new SoftAssert();
		System.out.println("Executed Test Case : 3");
		soft.assertEquals(true, false);
		System.out.println("Ending Test Case   : 3");
		soft.assertAll();
	}

	
	@Test
	public void Test4()
	{
		SoftAssert soft= new SoftAssert();
		int a=10,b=50;
		soft.assertEquals(a, b-40);
		System.out.println("Executed Test Case : 4");
		soft.assertAll();
	}

	
	@Test
	public void Test5()
	{
		SoftAssert soft= new SoftAssert();
		soft.assertEquals("Amarjeet", "Amarjeet");
		//Assert.assertEquals(true, true);
		System.out.println("Executed Test Case : 5");
		soft.assertAll();
	}

	
}
