package com.fft.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//p[text()=' Login or Create Account']")).click();
		
		
		Set<String> handler= driver.getWindowHandles();
		for(String child: handler)
		{
			driver.switchTo().window(child);
			driver.findElement(By.cssSelector("input#username")).sendKeys("ajsingh0110@gmail.com");
			driver.findElement(By.cssSelector("input#password")).sendKeys("Hardlocked1!");
			System.out.println(driver.getClass());
			
			
		}
		Thread.sleep(20000);
		
		
		WebElement e= driver.findElement(By.xpath("//div/div[@class='bgGradient']"));
		System.out.println(e.getAttribute("style"));
		
		WebElement e1=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		System.out.println(e1.getAttribute("data-notification-layout-name"));
		
		WebElement e2=driver.findElement(By.xpath("//a[@class='close']"));
		System.out.println(e2.getAttribute("id"));
		//e2.click();

		
		
	/*	driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		*/
		
		
		/*WebElement e1= driver.findElement(By.xpath("//a[@class='close']"));
		System.out.println(e1.getAttribute("id"));*/
		//driver.findElement(By.xpath("//a[@class='close']")).click();
	}
	
//		webengage-notification-container
		
		
		//driver.close();
	/*	driver.switchTo().frame(0);
		driver.close();*/
		
	

}
