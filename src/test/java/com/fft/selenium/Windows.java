package com.fft.selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		//WebElement element;

		//Open New Separated Window
		/*driver.findElement(By.cssSelector("a[href^='#Tab']")).click();
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();*/
		
		//Open New Separated Windows
/*		driver.findElement(By.cssSelector("a[href^='#Sep']")).click();
		driver.findElement(By.cssSelector("button.btn-primary")).click();*/
		
		//Open New Separated Multiple Windows
		driver.findElement(By.cssSelector("a[href^='#Mul']")).click();
		driver.findElement(By.cssSelector("button[onclick='multiwindow()']")).click();
		Thread.sleep(3000);
		
		/*String parent= driver.getWindowHandle();
		System.out.println(parent);
		*///Set<String> handler= driver.getWindowHandles();
		
		ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles());
		ArrayList<String> title= new ArrayList<String>();

		for(int i=0;i<child.size();i++)
		{
			System.out.println(driver.switchTo().window(child.get(i)).getTitle());
		}
		
		
		//Switching to another window by using ArrayList
		driver.switchTo().window(child.get(2));
		
/*
		driver.switchTo().window(size.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().window(size.get(2));
		System.out.println(driver.getTitle());*/
		
		
		
		
//		driver.switchTo().window(//);
		
		/*for(int i=1;i<=size;i++)
		{
			driver.switchTo().window();
		}*/
		
		/*
		for(String child: handler)
		{ 
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println(child);
				System.out.println(driver.getCurrentUrl());

				
			}
		}*/
		
	}

}


//Switching to another tab without using foreach
