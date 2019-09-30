package com.fft.selenium;
import javax.print.attribute.standard.DateTimeAtCompleted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wikipedia {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		Select select = new Select(driver.findElement(By.id("searchLanguage")));
		System.out.println("Total Languages are : " +select.getOptions().size());
		
		for(int i=0; i<select.getOptions().size();i++)
		{
			System.out.println(select.getOptions().get(i).getText());
		}
		
		/*WebElement element=driver.findElement(By.id("searchLanguage"));
		System.out.println(element.getText());*/
		
		
		
		
		
		
	}

}

