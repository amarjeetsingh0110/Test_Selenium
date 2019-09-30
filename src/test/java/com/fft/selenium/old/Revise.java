package com.fft.selenium.old;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise {

	WebDriver driver;
	public void driverLoading()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-webdriver/webelement-commands/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='menu-text'][text()='HOME']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href='http://www.forumsqa.com/']")).click();
		
		
		//String parent= driver.getWindowHandle();
		Set<String> child= driver.getWindowHandles();
		driver.switchTo().frame(1);
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//input[@type='text'][@name='email'][1]")).sendKeys("Amarjeet");
		
		//driver.switchTo().window(arg0)
		
		
		
		
	}
	
	public static void main(String[] args) {
		Revise object= new Revise();
		object.driverLoading();
		
	}
}
