package com.fft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	static WebDriver driver;
	
	public static void main(String[] args)  {
		//Testing
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Github\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("ajsingh0110@gmail.com");
		driver.findElement(By.cssSelector("span.RveJvd")).click();
		
		//Error: Element is not attached to the page Document.
		//driver.findElement((By.xpath("//input[@type='password']"))).sendKeys("Testing");
		
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("Testing");;
		
		//Error: Element is not attached to the page Document.
		/*WebElement element= driver.findElement(By.xpath("//input[@type='password']"));
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys("Testing");;
		*/ 
		
		
		 
		
		
		//element.sendKeys("Testing");
		
		
		
		
		/*driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Testing");
		*/
	}

}
