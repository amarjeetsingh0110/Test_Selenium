package com.fft.selenium.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripProject {

	//static WebDriver driver;
	Properties prop;
	FileInputStream fis;
	Logger log = Logger.getLogger(MakeMyTripProject.class.getClass());

	
	@BeforeClass
	public void fileLoading() throws IOException
	{
		PropertyConfigurator.configure("./src/test/resources/configurations/log4j.properties");
		//Load Config File
		prop= new Properties();
		fis= new FileInputStream("./src/test/resources/configurations/mmt.config");
		prop.load(fis);
		log.info("Configuration File Loaded Successfully...!!!! ");
				
		//Load Locators File
		fis=new FileInputStream("./src/test/resources/locators/mmt.locators");
		prop.load(fis);
		log.info("Locators File Loaded Successfully...!!!! ");

		//Load Data File
		fis=new FileInputStream("./src/test/resources/testData/mmt.data");
		prop.load(fis);
		log.info("Data File Loaded Successfully...!!!! ");
		
	}
	
		@BeforeMethod
		public void browerLaunch()
		{
			WebDriverManager.chromedriver().setup();
			CommonUtilites.driver=new ChromeDriver();
			log.info("Chrome Browser opened");
			CommonUtilites.driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")), TimeUnit.SECONDS);
			CommonUtilites.driver.manage().window().maximize();
			CommonUtilites.driver.get(prop.getProperty("siteUrl"));
			log.info("Navigating to :" +prop.getProperty("siteUrl"));
			
		}
		
		@Test(priority=2)
		public void login() 
		{
			CommonUtilites.driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")), TimeUnit.SECONDS);
			CommonUtilites.click(prop.getProperty("loginButton"));
			log.info("Opening Login Windows");
			CommonUtilites.presenceOfElement(prop.getProperty("loginWithGoogle"));
			CommonUtilites.click(prop.getProperty("loginWithGoogle"));
			log.info("Trying to login via Google Account...!!!");
			
			Set<String> windowId=CommonUtilites.driver.getWindowHandles();
			Iterator<String> it=windowId.iterator();
			while(it.hasNext())
			{
				CommonUtilites.driver.switchTo().window(it.next());
			}
			CommonUtilites.type(prop.getProperty("googleEmail"), prop.getProperty("gUsername"));
			log.info("Entering Google Credentials to Login into : "+prop.getProperty("siteUrl"));
			CommonUtilites.click(prop.getProperty("loginNextButton"));
			CommonUtilites.type(prop.getProperty("googlePassword"), prop.getProperty("gPassword"));
			CommonUtilites.presenceOfElement(prop.getProperty("loginNextButton"));
			CommonUtilites.click(prop.getProperty("loginNextButton"));
			log.info("Login to "+prop.getProperty("siteUrl")+ " is successfully done via Google Account Credentials.");
			CommonUtilites.driver.quit();
		}
		
		@Test(priority=2)
		public void oneWayTripFinder() 
		{
			CommonUtilites.click(prop.getProperty("oneWayTrip"));
			log.info("Selected One Way Trip");
			CommonUtilites.click(prop.getProperty("fromCity"));
			CommonUtilites.type(prop.getProperty("fromCity_AafterClick"), ("Delhi"));
			CommonUtilites.click(prop.getProperty("toCity"));
			CommonUtilites.type(prop.getProperty("toCity_AfterClick"), ("Mumbai"));
			CommonUtilites.click(prop.getProperty("departure"));
			CommonUtilites.click(prop.getProperty("departureDate"));
			CommonUtilites.click(prop.getProperty("return"));
			CommonUtilites.click(prop.getProperty("returnDate"));
			CommonUtilites.click(prop.getProperty("travelAndClass"));
			CommonUtilites.click(prop.getProperty("adult"));
			CommonUtilites.click(prop.getProperty("children"));
			CommonUtilites.click(prop.getProperty("travelClass"));
			CommonUtilites.click(prop.getProperty("applyButton"));
			CommonUtilites.click(prop.getProperty("searchButton"));
			CommonUtilites.driver.quit();
		}
		
		@Test(priority=3)
		public void roundTripFinder() 
		{
			CommonUtilites.click(prop.getProperty("roundTrip"));
			CommonUtilites.click(prop.getProperty("fromCity"));
			CommonUtilites.type(prop.getProperty("fromCity_AafterClick"), ("Delhi"));
			CommonUtilites.click(prop.getProperty("toCity"));
			CommonUtilites.type(prop.getProperty("toCity_AfterClick"), ("Mumbai"));
			CommonUtilites.click(prop.getProperty("departure"));
			CommonUtilites.click(prop.getProperty("departureDate"));
			CommonUtilites.click(prop.getProperty("return"));
			CommonUtilites.click(prop.getProperty("returnDate"));
			CommonUtilites.click(prop.getProperty("travelAndClass"));
			CommonUtilites.click(prop.getProperty("adult"));
			CommonUtilites.click(prop.getProperty("children"));
			CommonUtilites.click(prop.getProperty("travelClass"));
			CommonUtilites.click(prop.getProperty("applyButton"));
			CommonUtilites.click(prop.getProperty("searchButton"));
			CommonUtilites.driver.quit();
			
		}
		
	
}