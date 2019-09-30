package com.fft.selenium.old;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DuplicateLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		HashSet<String> list1= new HashSet<String>();
		List<WebElement> list=  driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		
		for(WebElement element: list)
		{
			String linkName=element.getAttribute("Href");
			list1.add(linkName);
			
			
		}
		System.out.println(list1.size());
		/*for(int i=1;i<=)
		System.out.println(list1);
		*/
/*		
		
		Iterator<String>�itr=list1.iterator();���
		��while(itr.hasNext()){���
		���System.out.println(itr.next());��} */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(WebElement element: list)
		{
			System.out.println(element.getAttribute("href"));
		}
		
		*/
		
		
		
		
	/*	for(int i=1;i<=list.size();i++)
		{
			WebElement element;
			System.out.println(element.getAttribute("href"));
		}*/
		driver.close();
	}
}
