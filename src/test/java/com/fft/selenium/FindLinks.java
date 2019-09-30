
package com.fft.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fft.selenium.browser.*;


public class FindLinks {
public static void main(String[] args) {
	BrowserLaunch obj= new BrowserLaunch();
	WebDriver driver=obj.launch();
	
	driver.get("https://www.wikipedia.org/");
	
	//Finding all the Link over the page By using Tagname
	//List<WebElement> list=driver.findElements(By.tagName("a"));
	
	//Finding all the Link in a particular section over the page By using CSS Selector
	//First find the Main Block with the help of findElement and then again find the Attribute within the same Block.
	
	//Example : 1
	/*WebElement element=driver.findElement(By.cssSelector("div.central-featured"));
	List<WebElement> list= element.findElements(By.tagName("a"));
	
	
	for(WebElement element1:list)
	{
		System.out.println(element1.getAttribute("href"));
		
	}*/
	
	
	//Example : 2
		/*WebElement element=driver.findElement(By.cssSelector("div.central-featured"));
		List<WebElement> list= element.findElements(By.tagName("a"));
		
		
		for(WebElement element1:list)
		{
			System.out.println(element1.getAttribute("href"));
			
		}*/

	driver.close();
}
}
