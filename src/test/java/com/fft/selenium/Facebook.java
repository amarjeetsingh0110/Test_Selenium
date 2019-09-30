package com.fft.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	WebDriver driver;
	
	public void driver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		driver= new ChromeDriver();
		browser();
	}
		
	public void browser()
	{
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		perform();
		
	}
	
/*	public void pathLocator(String path)
	{
		driver.findElement(By.name())
		
	}
	*/
	public void perform()
	{
		
		
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("value"));
		}
		
		
		/*driver.findElement(By.name("firstname")).sendKeys("Amarjeet");
		
		
		driver.findElement(By.partialLinkText("Forgot a")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		driver.findElement(By.id("u_0_h")).sendKeys("9899784211");
		driver.findElement(By.id("u_0_o")).sendKeys("dasflynasvdsdfsdsd");
		
		Select combo= new Select(driver.findElement(By.id("month")));
		combo.selectByVisibleText("Oct");
		
		Select combo2= new Select(driver.findElement(By.id("day")));
		combo2.selectByVisibleText("1");
		
		Select combo3= new Select(driver.findElement(By.id("year")));
		combo3.selectByVisibleText("1986");
		
		driver.findElement(By.xpath("//input[@name='sex'][@value=2]")).click();
		
		
		System.out.println(driver.findElement(By.name("websubmit")).getText());
		System.out.println(driver.findElement(By.name("websubmit")).getTagName());
		System.out.println(driver.findElement(By.name("websubmit")).getLocation());
		System.out.println(driver.findElement(By.name("websubmit")).getSize());*/
		
		
		//BY CSS LOCATORS
		
		/*driver.findElement(By.cssSelector("input#email")).sendKeys("Amarjeet Singh");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Testing");
		
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("Amarjeet");
		driver.findElement(By.cssSelector("input[aria-describedby=js_1ht]")).sendKeys("Singh");
		driver.findElement(By.cssSelector("input#u_0_h")).sendKeys("9899784211");
		
		Select combo1= new Select(driver.findElement(By.cssSelector("select#month")));
		combo1.selectByVisibleText("Oct");
		
		Select combo2= new Select(driver.findElement(By.cssSelector("select#day")));
		combo2.selectByVisibleText("1");
		
		Select combo3= new Select(driver.findElement(By.cssSelector("select#year")));
		combo3.selectByVisibleText("2000");
		*/
	}
	
		public static void main(String[] args) {
		Facebook runner= new Facebook();
		runner.driver();
		
	}
}
