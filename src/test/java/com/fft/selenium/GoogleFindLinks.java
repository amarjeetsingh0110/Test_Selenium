package com.fft.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fft.selenium.browser.BrowserLaunch;
public class GoogleFindLinks {
	public static void main(String[] args){
		BrowserLaunch obj= new BrowserLaunch();
		WebDriver driver=obj.launch();
		
		driver.get("http://www.google.com");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Testing");
		driver.findElement(By.xpath("//div[@jsname='VlcLAe']//input[@name='btnK']")).click();
		
		WebElement element=driver.findElement(By.cssSelector("div#rso"));
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='srg']//h3"));
		
		for(WebElement element2:list)
		{
			System.out.println(element2.getText());
		}
	}

}
