package com.fft.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fft.selenium.browser.BrowserLaunch;
public class RightClickPopUpMenu {
	
	WebDriver driver;
	public void howToSetup()
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		
		WebElement element=driver.findElement(By.cssSelector("img[src='data-samples/images/popup_pic.gif']"));
		
		Actions action= new Actions(driver);
		action.contextClick(element).perform();
		action.moveToElement(driver.findElement(By.cssSelector("td#dm2m1i1tdT"))).perform();
		action.moveToElement(driver.findElement(By.cssSelector("td#dm2m2i1tdT"))).perform();
		action.moveToElement(driver.findElement(By.cssSelector("td#dm2m3i1tdT"))).build().perform();
		driver.findElement(By.cssSelector("td#dm2m3i1tdT")).click();
		
	}
	
	
	
	public static void main(String[] args) {
		new RightClickPopUpMenu().howToSetup();
	}

}
