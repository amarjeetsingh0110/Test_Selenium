package com.fft.selenium.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass1 {
	
	@Test
	public void a()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test(priority=0) 
	public void b()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test(priority=1)
	public void c()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test(priority=2)
	public void d()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test
	public void e()
	{
		System.out.println("We are currently inside : " +Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
