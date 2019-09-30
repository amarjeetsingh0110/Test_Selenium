package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SelectClass {

	public static void main(String[] args) throws InterruptedException   {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");

		Select selection= new Select(driver.findElement(By.id("continents")));
		int size=selection.getOptions().size();
		// Select by value
		//selection.selectByVisibleText("Europe");
		//selection.selectByIndex(3);
		System.out.println(selection.getOptions().get(2).getText());
		//System.out.println(selection.selectByVisibleText(arg0));
		//System.out.println(size);
		for(int i=0;i<size;i++)
		{
			selection.selectByIndex(i);
			Thread.sleep(1000);
				
		}
		
		
	}
}
