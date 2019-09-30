package com.fft.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	
	ChromeDriver driver;
	
	public void browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/Automation-practice-form");
		elementLocator();
	}
	
	public void elementLocator() throws InterruptedException
	{
		WebElement element=driver.findElement(By.name("firstname"));
		element.sendKeys("Amarjeet Singh");
		Thread.sleep(3000);
		element.clear();
		
		
		
		element=driver.findElement(By.id("sex-0"));
		Boolean verify=element.isSelected();
		if(verify!=true)
		{
			System.out.println("Value is not Chekcked");
			element.click();	
			Thread.sleep(3000);
			
		}
		
		else
		{
			System.out.println("Value is already Chekcked");

		}
		System.out.println(element.getAttribute("sex-0").length());
		driver.quit();
	}
	
	public void actionPerform()
	{
		
	}
	

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebElements object= new WebElements();
		object.browser();
		
	}

}
