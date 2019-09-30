package com.fft.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fft.selenium.browser.BrowserLaunch;

public class TiZag {
	WebDriver driver;
	
	public static void main(String[] args) {
		TiZag obj1= new TiZag();
		obj1.launch();
	}

	public void launch()
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='football']")));
		driver.findElements(By.xpath("//input[@value='football']")).get(1).click();
		
		
		
		/*List<WebElement> list =driver.findElements(By.xpath("//input[@value='football']"));
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='football']")));
	//	list.get(0).click();
		list.get(1).click();*/
	}
	
	
	
}
