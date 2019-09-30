package com.fft.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fft.selenium.browser.BrowserLaunch;
public class PresenceOfElement {
	   static WebDriver driver;
	
	   
	   public static void main(String[] args) {
		BrowserLaunch obj= new BrowserLaunch();
		 driver=obj.launch();
		
		 driver.get("https://www.w3schools.com/java/java_conditions.asp");
		 PresenceOfElement obj2=new PresenceOfElement();
		 
		 //Example 1: calling isElementPresent method by passing Xpath[Restriction] only
		/* Boolean value=obj2.isElementPresent("//a[text()='Java HOME  s']");*/
		 
		 //Example 2: calling isElementPresent method by passing object of By Class[id/xpath/tagname/classname...]
		 Boolean value= obj2.isElementPresnt(By.xpath("//a[text()='Java HOME']"));
		 
		 
		 System.out.println(value);
	}

	//Example 1:
	//Checking the presence of an element by using Xpath only.
	public boolean isElementPresent(String Xpath)
	{
		try {
		driver.findElement(By.xpath(Xpath));
			return true;
		}
		catch (Throwable e) {
			return false;
		}
		}
	
	
	//Checking the presence of an element by using object of By Class.
		public Boolean isElementPresnt(By by)
		{
			driver.findElement(by);
			return true;
			
		}
}
	 