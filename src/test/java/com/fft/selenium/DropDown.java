package com.fft.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
	
	WebDriver driver;
	
	public void Selection() throws InterruptedException
	{
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		
		System.out.println("Size of the list is :" +oSelect.getOptions().size());
		
		oSelect.selectByIndex(1);   // Selecting the Drop Down 1st option by using index value.
		Thread.sleep(2000);
		oSelect.selectByVisibleText("North America");	// Selecting the Drop Down option by using VisibleText method.
		Thread.sleep(2000);
		
		
		//Print all the element in the Drop Down. For that we have to use a loop and use until it reaches to the last value.
		List <WebElement> element= oSelect.getOptions();
		int size=element.size();
		
		System.out.println(":::::::::Normal Order:::::::::");
		for(int i=0; i<size; i++)
		{
			
			System.out.println(element.get(i).getText());
		}
		
		System.out.println("\n:::::::::Reverse Order:::::::::");
		for(int j=size-1;j>=0;j--)
		{
			
			System.out.println(element.get(j).getText());
		}
		
		

		//Multiple Selection: 
		//For Multiple selection(like LIST), First we have to create an object of Select Class and then perform operation(like select/deselect/select all/deselect all) on it.
		
		Select oSelect1 = new Select(driver.findElement(By.cssSelector("select#selenium_commands")));    //Creating a Select Class object and assigning the element find by cssSelector
		List<WebElement> element1= oSelect1.getOptions();  												// Creating a List of WebElement and storing all the options of already created Select object.
	//	int listSize= element1.size();																	// Getting WebElement list size.
			
		// Hands on MultiSelect methods.
		oSelect1.selectByIndex(0);
		Thread.sleep(2000);
		oSelect1.selectByVisibleText("WebElement Commands");
		Thread.sleep(2000);
		oSelect1.selectByIndex(2);
		Thread.sleep(2000);
		
		List <WebElement> list2= oSelect1.getAllSelectedOptions();
		System.out.println("\n:::::::::Semi Selected:::::::::");
		for(int k=0;k<list2.size();k++)
		{
			System.out.println(list2.get(k).getText());
		}
		

		oSelect1.deselectAll();
		Thread.sleep(2000);
		
		System.out.println("\n:::::::::All Selected:::::::::");
		for(int k=0;k<element1.size();k++)
		{
			oSelect1.selectByIndex(k);
			System.out.println(element1.get(k).getText());
		}
		
		
		Thread.sleep(5000);
		
		System.out.println("================Window is getting Closed================");
		driver.quit();
		
		
	}
	
	
	public void driver() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		Selection();

	}
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		DropDown obj= new DropDown();
		obj.driver();
	}

}
