package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitCommand {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");

	
//	driver.findElement(By.xpath("//button[@id='invisibility']")).click();
	//System.out.println(element1.isDisplayed());
	
	waiting(driver, 10,"//button[@id='invisibility']");
	waiting(driver, 10,"//button[text()='New Message Window']");

	System.out.println("Time Completed");
	
	Thread.sleep(5000);
	driver.quit();

	}


	public static void waiting(WebDriver driver1, long time, String Path)
	{
		WebDriverWait wait= new WebDriverWait(driver1, time);
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Path)));
		element.click();
		
		
	
	}
}
