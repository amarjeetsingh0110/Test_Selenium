package com.fft.selenium.browser;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

 public WebDriver driver;
 
	public  WebDriver launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Test_Selenium\\Browser\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
