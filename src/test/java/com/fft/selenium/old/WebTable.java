package com.fft.selenium.old;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		List<WebElement> list = driver.findElements(By.xpath("//thead/tr/th"));
		int size= list.size(); //This will return total header of rows of the table.
		
		for(int i=0;i<size;i++)
		{
			System.out.println(list.get(i).getText());
		}
		System.out.println("************************");
		
		String beforeXpath="//tbody/tr[";
		String afterXpath="]/th[1]";
		
		List<WebElement> listRow=driver.findElements(By.xpath("//tbody/tr"));
		int rowCount=listRow.size(); //This will return total number of rows of the table.
		
		for(int i=1;i<=rowCount;i++)
		{
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
		System.out.println("************************");

		
		String beforeXpath1="//tbody/tr[1]/td[";
		String afterXpath1="]";
		
		List<WebElement> listRow1=driver.findElements(By.xpath("//tbody/tr[1]/th"));
		int rowCount1=listRow.size(); //This will return total number of rows of the table.
		
		for(int i=1;i<=rowCount1;i++)
		{
			String actualXpath=beforeXpath1+i+afterXpath1;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		driver.close();
		
			
	}
}
