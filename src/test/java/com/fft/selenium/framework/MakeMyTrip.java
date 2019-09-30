package com.fft.selenium.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	WebDriver driver;
	Properties prop;
	FileInputStream fis;
	
	
	public void mouseHover(String path)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(path))).perform();
		
	}
	public void click(String path)
	{
		driver.findElement(By.xpath(path)).click();
		
	}
	
	public void type()
	{
		
	}

	
	public void fileLoading() throws IOException
	{
		
		//Load Config File
		prop= new Properties();
		fis= new FileInputStream("./src/test/resources/configurations/mmt.config");
		prop.load(fis);
		
		//Load Locators File
		fis=new FileInputStream("./src/test/resources/locators/mmt.locators");
		prop.load(fis);
		
		
		browser();
	}
	
	
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("siteUrl"));
		
		mouseHover(prop.getProperty("moreDropDown_Xpath"));
		click(prop.getProperty("dropDownSelect"));
		
		
		
	}
	public void search()
	{
		
	}
	
	public static void main(String[] args) throws IOException {
		new MakeMyTrip().fileLoading();
		
	}
	
	
	
	
}
