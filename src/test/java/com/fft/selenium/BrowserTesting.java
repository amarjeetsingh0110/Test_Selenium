package com.fft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Github\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


		
		
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("identifierId")).sendKeys("ajsingh0110@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Testing");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText());
		driver.close();

	}

}
