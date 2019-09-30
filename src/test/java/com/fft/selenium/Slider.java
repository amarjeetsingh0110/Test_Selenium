package com.fft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

import com.fft.selenium.browser.BrowserLaunch;
public class Slider {
	
	WebDriver driver;
	public void sliderMovement() throws InterruptedException
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	
		
		driver.switchTo().frame(0);
		Actions action= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[@tabindex='0']"));
		action.clickAndHold(element).moveByOffset(200, 0).release().perform();
		Thread.sleep(3000);
		action.clickAndHold(element).moveByOffset(-200, 0).release().perform();
		
		
		
		
		
		
		
		//int size=element.getSize().width/10;
		/*System.out.println(size);
		System.out.println(element.getAttribute("class"));*/
		
		//action.dragAndDropBy(element, size, 0).perform();
		//driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Slider().sliderMovement();
		
	}

}
