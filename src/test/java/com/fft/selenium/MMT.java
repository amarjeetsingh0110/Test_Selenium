package com.fft.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT {
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Github\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("input#fromCity")).click();
		WebElement element= driver.findElement(By.cssSelector("ul[role='listbox']"));
		List<WebElement> list= element.findElements(By.cssSelector("div.calc60>p"));
		
		for(WebElement element1:list)
		{
			System.out.println(element1.getText());
		}
}

}
