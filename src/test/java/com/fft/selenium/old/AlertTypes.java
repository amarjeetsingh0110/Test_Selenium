package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertTypes {
	
	WebDriver driver;
	int a=1;
	
public static void main(String[] args) 
	{
	AlertTypes object= new AlertTypes();
	object.driver();
	
	
	}

	public void driver()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	action("//button[@onclick='pushAlert()']");
	action("//button[@onclick='pushConfirm()']");
	action("//button[@onclick='promptConfirm()']");
	//promptConfirm()
	}

	public void action(String path)
	{
		driver.findElement(By.xpath(path)).click();
		alertHandle();
		
	}
	
	public void alertHandle()
	{
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		if(text.contains("simple"))
		{
			
			alert.accept();	
		}
		else if(text.contains("OK and Cancel"))
		{
			alert.dismiss();
		}
		else if(text.contains("Do you like toolsqa?"))
		{
			
			alert.sendKeys("Yes");
			alert.accept();
		}
		
		
	}
}
