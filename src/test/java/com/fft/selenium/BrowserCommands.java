package com.fft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Github\\Repositories\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Options man=driver.manage();
		Window win=man.window();
		win.maximize();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		System.out.println(driver.getClass());
		System.out.println(driver.getCurrentUrl());
		
		String Title;
		Title= driver.getTitle();
		System.out.println(Title);
		
		driver.findElement(By.xpath("//button[@id='submit']"));
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.quit();
	}

}
