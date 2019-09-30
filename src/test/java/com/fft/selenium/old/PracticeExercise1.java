package com.fft.selenium.old;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeExercise1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		Boolean b;
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//To check how many radio buttons are checked by old approach.
		/*List<WebElement> radio  =  driver.findElements(By.name("exp"));
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("exp-5")).click();
		
		for(int i=0;i<=6;i++)
		{
			System.out.println(b=radio.get(i).isSelected());

		}*/
		
		//====================================================================================
		
		//To check how many check boxes are checked by for loop.
		/*List<WebElement> ch= driver.findElements(By.name("tool"));
		int iSize=ch.size();
		for(int i=0;i<=iSize;i++)
		{
			//System.out.println(ch.get(i).getAttribute("value"));
			ch.get(i).click();
			//driver.findElement(By.name("tool")).click();
			//driver.findElement(By.name(check.get(i))).click();
			i=i+1;
		}
		
		for(int j=0;j<iSize;j++) //loop to display which all checkboxes are checked.
		{
			Boolean ln=false;
			ln=ch.get(j).isSelected();
			
			if(ln==true)
			{
			System.out.println("Selected Checkbox: " +ch.get(j).getAttribute("value"));
			}
			
		}*/
		
		//====================================================================================
		
		
		List<WebElement> newList= driver.findElements(By.name("tool"));
		int size= newList.size();
		
		for (int i=0;i<size; i++)
		{
			String name=newList.get(i).getAttribute("Value");
			//System.out.println(name);
			if(name.equalsIgnoreCase("QTP") || name.equalsIgnoreCase("Selenium Webdriver"))
			{
				newList.get(i).click();	
			}
			
						
		}
		
		 
		
		
		
		
		
		//====================================================================================	
				
		Thread.sleep(2000);
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		
		//====================================================================================
	/*	driver.findElement(By.partialLinkText("Partial Link Test")).click();
		System.out.println(driver.findElement(By.tagName("button")).toString());
		driver.findElement(By.linkText("Link Test")).click();*/
		
		/*driver.findElement(By.name("firstname")).sendKeys("Amarjeet");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();*/
		//====================================================================================
	}
	
}

