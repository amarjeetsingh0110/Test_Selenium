package com.fft.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fft.selenium.browser.BrowserLaunch;
public class FormCount {
	
	WebDriver driver;
	public void count()
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		List<WebElement> list = driver.findElements(By.xpath("//iframe"));
		System.out.println("Total Frames available on the page are :"+list.size());
		for(WebElement element:list)
		{
		System.out.println("Frame Id :" +element.getAttribute("id"));
		}
		
		driver.close();
	}
	
	public static void main(String[] args) {
		new FormCount().count();
		
	}
}