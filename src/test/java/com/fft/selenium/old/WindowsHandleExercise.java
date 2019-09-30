package com.fft.selenium.old;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandleExercise {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	
	System.out.println(driver.getWindowHandle());
	
	driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
	
	Set<String> windowNames=driver.getWindowHandles();
	
	for(String count:windowNames)
	{
		System.out.println(count);
		driver.switchTo().window(count);
	}
	
	driver.close();
	
	}
}


