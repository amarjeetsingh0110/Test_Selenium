package com.fft.selenium.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass2 {
	
	@Test
	public void method1()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test
	public void method2()
	{	
		AssertJUnit.fail();
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test
	public void method3()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test
	public void method4()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

}
