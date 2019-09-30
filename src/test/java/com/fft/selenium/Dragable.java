package com.fft.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fft.selenium.browser.BrowserLaunch;; 

public class Dragable {
	
	WebDriver driver;
	
	public void dragTheBox() 
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		
		
		driver.get("http://jqueryui.com/draggable/");
		
		//Switching iframe by Xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//Switching iframe by Frame Index
		//driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		
		WebElement element= driver.findElement(By.cssSelector("div#draggable"));
		
		action.dragAndDropBy(element, 400, 100).perform();
		
	}
	public static void main(String[] args) {
		
		new Dragable().dragTheBox();
		
	}

}
