package com.fft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserNavigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Github\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.toolsqa.com/selenium-webdriver/browser-commands/");
		driver.findElement(By.xpath("//span[text()='Inspectors Tools & Locators']")).click();
		
		driver.findElement(By.xpath("//span[text()='Finding Elements using Browser Inspector']")).click();


		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
	}
}
