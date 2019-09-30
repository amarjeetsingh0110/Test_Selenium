package com.fft.selenium.old;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeExercise2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

	Thread.sleep(3000);
	List<WebElement> newList= driver.findElements(By.name("sex"));
	int size= newList.size();
	
	for (int i=0;i<size;i++)
	{
		String value = null;
		value=newList.get(i).getAttribute("value");
		if(value.equalsIgnoreCase("female"))
		{
			if(newList.get(i).isSelected()==false)
			{
			System.out.println("Value is not selected");
			newList.get(i).click();
			}
			
			else
			{
				System.out.println("Value is already selected");
			}
			
		}
		
			
	}
	
	List<WebElement> newList2= driver.findElements(By.name("exp"));
	int size2= newList2.size();
	for(int i=0;i<size2;i++)
	{
		String exp;
		exp=newList2.get(i).getAttribute("value");
		if(exp.equalsIgnoreCase("3"))
		{
			newList2.get(i).click();
		}
	}
	
	
	
	List<WebElement> List3= driver.findElements(By.name("profession"));
	int size3= List3.size();
	for(int i=0;i<size3;i++)
	{
		String value2= List3.get(i).getAttribute("value");
		if(value2.equalsIgnoreCase("automation Tester"))
		{
			List3.get(i).click();
		}
		
	}
	
	WebElement element=driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
	element.click();
	
	
	
		
	
	
	
	
}
}
