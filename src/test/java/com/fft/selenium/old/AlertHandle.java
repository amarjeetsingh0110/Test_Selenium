package com.fft.selenium.old;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	WebDriver driver;
	int value=0;
	
	public void driverLoading()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Github\\Repositories\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		pathFinder();
	}
	
	public void windowHandler()
	{
		String parent= driver.getWindowHandle();
		Set<String> handler=driver.getWindowHandles();
		if(value==0)
		{
		System.out.println(driver.switchTo().window(parent).getTitle());
		value=value+1;
	}
		
		for(String childWindows: handler)
		{
			if(!parent.equals(childWindows))
			{
				System.out.println(driver.switchTo().window(childWindows).getTitle());
				driver.close();
			}
				
			driver.switchTo().window(parent);
		}
	
	}
	public void browserWindows(String path)
	{
		driver.findElement(By.xpath(path)).click();
		windowHandler();
	}
	
	public void pathFinder()
	{
		browserWindows("//button[@id='button1']");
		browserWindows("//button[text()='New Message Window']");
		browserWindows("//button[text()='New Browser Tab']");
		alert("//button[@id='alert']");
	}
	
	public void alert(String path)
	{
		driver.findElement(By.xpath(path)).click();
		Alert alertHandle=driver.switchTo().alert();
		
		System.out.println(alertHandle.getText());
		alertHandle.accept();
		driver.quit();
	}
	
	public static void main(String[] args) {
		AlertHandle object= new AlertHandle();
		object.driverLoading();
	}
}
