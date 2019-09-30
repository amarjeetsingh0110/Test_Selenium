package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Function;


public class FluentWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		

		org.openqa.selenium.support.ui.FluentWait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.SECONDS);

		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
				{
					public Boolean apply(WebDriver arg0) {
						WebElement element = arg0.findElement(By.id("colorVar"));
						String color = element.getAttribute("color");
						System.out.println("The color if the button is " + color);
						if(color.equals("red"))
						{
							return true;
						}
						return false;
					}
				};

		wait.until(function);
	}
	}
 	
