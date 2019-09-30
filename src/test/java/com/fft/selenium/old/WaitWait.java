package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//TimeOut Exception handling
		/*driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://reporting.cadreon.com/");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		*/
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebElement element=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean visible=element.isDisplayed();
				
		if(visible)
		{
			System.out.println("Element Found on the Webpage");
		}
		
		else
		{
			System.out.println("Element not Found");
		}
		
		//Explicitly Wait
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement element1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		//WebElement element=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean visible1=element1.isDisplayed();
				
		if(visible1)
		{
			System.out.println("Element Found on the Webpage");
		}
		
		else
		{
			System.out.println("Element not Found");
		}
		
		driver.close();
	}
	

}
