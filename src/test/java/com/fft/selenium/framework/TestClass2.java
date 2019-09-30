package com.fft.selenium.framework;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass2 {
	
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
		System.out.println("Calling Method 4");
	}

	@Test
	public void method5()
	{
		throw new SkipException("Skip");
		//System.out.println("Calling Method 5");
	}

	@Test
	public void method6()
	{
		System.out.println("Calling Method 6");
	}

	
}
