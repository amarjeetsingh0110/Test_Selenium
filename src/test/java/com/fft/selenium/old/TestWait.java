package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestWait {

	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver wb= new ChromeDriver();
	
	wb.get("https://www.investing.com/");
	
	wb.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	wb.manage().window().maximize();
	wb.manage().deleteAllCookies();
		
	//Login via Google
		
	wb.findElement(By.xpath("//a[@class='login bold'][text()='Sign In']")).click();
	waiting(wb,50,"//div[@id='customBtn1']/span[2]");
	wb.findElement(By.xpath("//div[@id='customBtn1']/span[2]")).click();
	//wb.findElement(By.xpath("//div[@id='customBtn1']/span[2]"));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='customBtn1']/span[2]"))).click();
	
}
	
	public static void waiting(WebDriver abc, int wtime, String path)
	{	
		WebDriverWait wait= new WebDriverWait(abc, wtime);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
		
		
	}
	
	
}
