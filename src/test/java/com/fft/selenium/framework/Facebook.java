package com.fft.selenium.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.internet.AddressException;
import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	FileInputStream fis;
	Properties config;
	WebDriver driver;
	Logger log= Logger.getLogger(Facebook.class.getClass()); 
	static String msg="";

	static
	{
		PropertyConfigurator.configure("./src/test/resources/configurations/log4j.properties");
	}
	public void loadPropFile() throws IOException, EmailException
	{
		config= new Properties();
		fis= new FileInputStream("./src/test/resources/configurations/fb.config");
		config.load(fis);
		log.info("Facebook Config file loaded successfully...!!!");
		
		fis= new FileInputStream("./src/test/resources/locators/fb.locators");
		config.load(fis);
		log.info("Facebook locators file loaded successfully...!!!");

		fis=new FileInputStream("./src/test/resources/testData/data");
		config.load(fis);
		log.info("Facebook Data file loaded successfully...!!!");

		browserLauch();
		
	}
	
	public void browserLauch() throws EmailException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		log.info("Launching Chrome Browser.");

		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitWait")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(config.getProperty("siteUrl"));
		log.info("Navigating to :"+config.getProperty("siteUrl"));

		
		type(config.getProperty("userName_Css"),config.getProperty("userName"));
		type(config.getProperty("password_Css"),config.getProperty("password"));
		click(config.getProperty("logIn"));
		
	}
	
	public void type(String path, String value) throws EmailException
	{
		try 
		{
			driver.findElement(By.cssSelector(path)).sendKeys(value);
			log.info("Entering data in " +path+ " with values " +value);
		}
		catch (Throwable t) {
			log.error(t);
			Facebook.msg=t.getMessage();
			
		}
		
	}
	
	public void click(String path) throws EmailException
	{
		try
		{
			driver.findElement(By.cssSelector(path)).click();
			log.info("Clicking on " +path);
		}
		catch(Throwable t)
		{
			log.error(t);
			Facebook.msg=t.getMessage();
			
		}
	}
	
	
	public void doLogin(String email, String pwd)
	{
		
	}
	
	public void doLogin(long mobileNo, String pwd)
	{
		
	}

	
	public static void main(String[] args) throws IOException, EmailException, AddressException {
		Facebook fb=new Facebook();
		fb.loadPropFile();
		
		
		if(msg.isEmpty())
		{
			fb.log.info("Test Case Completed Successfully and closing " +fb.config.getProperty("browser") + " Browser...!!!");
			SendEmail.sendEmail("["+fb.getClass()+"]" +" Test Case Success", "Test Case Completed Successfully...!!!");
		}
		else
		{
			fb.log.info("Test Case Completed with Exception and closing " +fb.config.getProperty("browser") + " Browser...!!!");		
			SendEmail.sendEmail("["+fb.getClass()+"] Exception in Test Case Execution", msg);
		}
	
		fb.driver.quit();
	}
	
}
