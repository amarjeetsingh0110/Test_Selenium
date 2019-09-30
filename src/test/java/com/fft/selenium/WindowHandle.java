package com.fft.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows");
		
		//driver.findElement(By.cssSelector("button#button1")).click();    
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		
		String parent= driver.getWindowHandle();
	//	System.out.println(parent);
		Set<String> handler = driver.getWindowHandles();
		
		for(String child: handler)
		{
			
			if(!parent.equalsIgnoreCase(child))
			{
				handler.remove(parent);
				driver.switchTo().window(child);
				Thread.sleep(3000);
				System.out.println(driver.getCurrentUrl());
			
				WebElement e=driver.findElement(By.tagName("body"));
				System.out.println(e.getText());
			}
			else
			{
			
			}
		}
		driver.close();
		//driver.quit();
		
		
	}

}
