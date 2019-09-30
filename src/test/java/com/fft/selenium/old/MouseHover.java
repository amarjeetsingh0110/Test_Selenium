package com.fft.selenium.old;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {
public static void main(String[] args) throws Exception{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//a[@id='ch_login_icon']")).click();
	driver.findElement(By.xpath("//input[@id='ch_login_email']")).sendKeys("ajsingh0110@gmail.com");
	driver.findElement(By.xpath("//input[@id='ch_login_password']")).sendKeys("Hardlocked12!");
	driver.findElement(By.xpath("//button[@id='ch_login_btn']")).click();
	
	Thread.sleep(3000);
	
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//span[text()='wallet']"))).build().perform();
	driver.findElement(By.xpath("//button[@id='ch_wallet_view']")).click();
	
	//System.out.println(driver.findElement(By.xpath("//div[@id='wallet_All']/section[1]/descendant::span[1]")).getText());
	
	List<WebElement> list= driver.findElements(By.xpath("//div[@id='wallet_All']/section"));
	for(int i=1; i<=list.size();i++)
	{
		System.out.println(driver.findElement(By.xpath("//div[@id='wallet_All']/section["+i+"]/descendant::span[1]")).getText());
		List<WebElement> list1= driver.findElements(By.xpath("//div[@id='wallet_All']/section["+i+"]/descendant::span[@class='details-price flL']"));

		for(int j=1; j<=list1.size();j++)
		{
			String status=driver.findElement(By.xpath("//div[@id='wallet_All']/section["+i+"]/descendant::span[@class='details-price flL']["+j+"]")).getText();
			//status.replace("\n", ":");
			if(status.contains("Added")||status.contains("Expired"))
			{
				String[] val = status.split("\n");
				System.out.println(val[0]+" "+val[1]);
			}
			
			else
			{
				System.out.println(status);
			}
				
		}
		
		System.out.println("=====================================");
		
	}
	driver.close();
	
}
}
