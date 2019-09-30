package com.fft.selenium;
import java.lang.Object;
import java.io.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.fft.selenium.browser.BrowserLaunch;
public class HdfcBank {
	
	WebDriver driver;
	public void functionality() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Github\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");	
		/*
		Map<String, Object> prefs= new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		*/
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://icicibank.com");
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(screenshot, new File("d:/Screenshots/screenshot.jpg"));
		
		
		/*
		driver.findElement(By.cssSelector("a#loginsubmit")).click();
		Set<String> windowsList=driver.getWindowHandles();
		System.out.println(windowsList.size());
		Iterator<String> it=windowsList.iterator();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://www.hdfcbank.com/personal/products/cards/debit-cards/easyshop-platinum-debit-card']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[@href='/htdocs/common/testimonials/cards/debit_card.html?src=easyshopPltinmDc']")).click();
		windowsList=driver.getWindowHandles();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/
		
		
		//driver.switchTo().window(nameOrHandle)
		
		
		
		//driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		new HdfcBank().functionality();
		
	}
}
