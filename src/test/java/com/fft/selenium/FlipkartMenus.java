package com.fft.selenium;

import java.util.List;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fft.selenium.browser.BrowserLaunch;

public class FlipkartMenus {

	WebDriver driver;
	public void menuSelection()
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		driver.get("http://Flipkart.com");
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("ABC");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		List<WebElement> list= driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(list.get(0)).perform();
		
		//Top Menu List
		List<WebElement> list1= driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		//int mainMenuSize=list1.size();
	
		String xPath1="//div[@class='zi6sUf']/div/ul/li[";
		String xPath2="]/span/following-sibling::ul/li/ul/li/ul/li/a";
		String xpath="";
		
		//List<WebElement> list2= driver.findElements(By.xpath("//div[@class='zi6sUf']/div/ul/li/span/following-sibling::ul/li/ul/li/ul/li"));
		//System.out.println(list2.size());
		/*String xPath3="//div[@class='zi6sUf']/div/ul/li[";
		String xPath4="]/span/following-sibling::ul/li/ul/li/ul/li";
		String xpathagain="";*/
		
		List<WebElement> list3= driver.findElements(By.xpath("//ul[@class='QPOmNK']/li/a"));
	    //System.out.println(list3.size());
		
		
		for(int pp=1;pp<=list1.size();pp++)
		{
			xpath=xPath1+pp+xPath2;
			String[] a= new String[list3.size()];
		
			for(int k=0;k<list1.size();k++)
			{
			System.out.println(list1.get(k).getText());
			
			System.out.println(driver.findElement(By.xpath(xpath)).getAttribute("title"));
			
					/*if(a[i].equalsIgnoreCase("_1KCOnI _2BfSTw _1h5QLb _3ZgIXy"))
					{
						System.out.println("===================================");
						System.out.println("Category====>>> : " +list3.get(i).getAttribute("title"));
						System.out.println("===================================");
					}
			else
			{
			System.out.println(list3.get(i).getAttribute("title"));
			}*/
		}
		System.out.println("############################################################################");
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int j=0;j<a.length;j++)
		{
		
			System.out.println(a[j]);
		}*/
		
		//driver.close();
		
		////a[@title="+list2.get(0).getText()+"]/../following-sibling::li
		
		
	  //a[@title='Mobiles']/../following-sibling::li
		
		
		
		
		
		
		
		
		
		/*for(WebElement element1: list3)
		{
			System.out.println(element1.getAttribute("title"));
			
		}
		*/
		
		
		/*for(WebElement element: list)
		{
			System.out.println(element.getText());
		}*/
	
	
	public static void main(String[] args) {
	
		new FlipkartMenus().menuSelection();
	}
	
	
}
