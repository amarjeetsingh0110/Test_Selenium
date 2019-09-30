package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mmt {

	WebDriver driver;
	public void pageLoading() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("ch_login_icon")).click();
		driver.findElement(By.id("ch_login_email")).sendKeys("ajsingh0110@gmail.com");
		driver.findElement(By.id("ch_login_password")).sendKeys("Hardlocked12!");
		driver.findElement(By.id("ch_login_btn")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
public static void main(String[] args) throws InterruptedException {
	{
		
	Mmt object= new Mmt();
	object.pageLoading();
	}
}

}
