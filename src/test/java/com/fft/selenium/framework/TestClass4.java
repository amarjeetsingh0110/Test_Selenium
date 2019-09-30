package com.fft.selenium.framework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass4 {
	
	@Test
	public void method1()
	{
		System.out.println("Calling Method 1");
	}

	@Test
	public void method2()
	{
		System.out.println("Calling Method 2");
	}

	@Test
	public void method3()
	{
		System.out.println("Calling Method 3");
	}

	@Test
	public void method4()
	{
		Assert.fail();
		System.out.println("Calling Method 4");
	}

	@Test
	public void method5()
	{
		System.out.println("Calling Method 5");
	}

	@Test
	public void method6()
	{
		System.out.println("Calling Method 6");
	}

	
}
