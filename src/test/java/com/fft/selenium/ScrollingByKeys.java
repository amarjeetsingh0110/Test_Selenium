package com.fft.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.fft.selenium.browser.BrowserLaunch;

public class ScrollingByKeys {
	WebDriver driver;

	public void scrolling()
	{
	
	BrowserLaunch obj= new BrowserLaunch();
	driver=obj.launch();
	driver.get("http://deluxe-menu.com/popup-mode-sample.html");
	
	Actions action = new Actions(driver);
	driver.findElement(By.cssSelector("input[type=button']")).sendKeys(Keys.PAGE_DOWN);
	//action.keyDown(Keys.ARROW_DOWN).perform();
	
	
	}


	public static void main(String[] args) {
		new ScrollingByKeys().scrolling();
	}
}
