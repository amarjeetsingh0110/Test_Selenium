package com.fft.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilites {
	
	static WebDriver driver;
	
	public static void type(String path, String value)
	{
		
		driver.findElement(pathFinder(path)).sendKeys(value);
	}
		
	
	public static By pathFinder(String value)
	{
		if(value.contains("XPATH"))
		{
			value=value.split("~")[1];
			return (By.xpath(value));
		}
		else if(value.contains("CSS"))
		{
			value=value.split("~")[1];
			return (By.cssSelector(value));
		}
		return null;
	}
	
	
	public static void click(String path)
	{
		driver.findElement(pathFinder(path)).click();

	}
	
	public static void explicitWait(String locaterPath)
	{
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(pathFinder(locaterPath))));
	}
	
	public static void presenceOfElement(String locaterPath)
	{
		WebDriverWait wait= new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(pathFinder(locaterPath))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(pathFinder(locaterPath)));
		//		presenceOfElementLocated(pathFinder(locaterPath)));
	}
	
	public static boolean invisibilityOfElement(String locaterPath)
	{
		WebDriverWait wait= new WebDriverWait(driver, 5);
		Boolean b=wait.until(ExpectedConditions.invisibilityOf(driver.findElement(pathFinder(locaterPath))));
		return b;
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(pathFinder("XPATH_//span[@class='lbl_input latoBold appendBottom10]"))));
	}

}
