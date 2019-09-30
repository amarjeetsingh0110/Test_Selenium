package com.fft.selenium.old;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewBrowserTab {

	
	
	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
			String parent=driver.getWindowHandle();
			System.out.println(parent);
			
			driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
			
			Set<String> allWindows=driver.getWindowHandles();
			int size=allWindows.size();
			
			for(String childWindows:allWindows)
			{
				if(!parent.equals(childWindows))
				{
					driver.switchTo().window(childWindows);
					System.out.println(childWindows);
					
				}
				
				
			}
			
	}
	}	
}
