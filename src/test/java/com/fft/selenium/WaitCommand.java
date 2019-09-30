package com.fft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitCommand {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button#timingAlert")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		System.out.println("Waiting for the Alert");
		
		//Alert alert= wait.until(ExpectedCondition.alert);
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myAlert.getText());
		
		myAlert.accept();
		
		WebElement element= driver.findElement(By.cssSelector("span#clock"));
		String text= element.getText();
		if(text.equalsIgnoreCase("Buzz  Buzz"))
		{
			System.out.println("Text found on the Webpage");
		}
		else
		{
			System.out.println(text+ "  ==>>>Polling Started.");
			
			Wait wait1= new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS);
			
		}
		
		System.out.println(element.getText());		
		
		
	}

}
