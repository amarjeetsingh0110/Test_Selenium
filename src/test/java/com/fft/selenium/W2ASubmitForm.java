package com.fft.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class W2ASubmitForm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Github\\Repository\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Amarjeet Singh");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9899784211");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Testing@gmail.com");
		
		Select select = new Select(driver.findElement(By.cssSelector("select[name='country']")));
		select.selectByIndex(12);
		
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//fieldset[6]/input[@name='username']")).sendKeys("Testing");
		driver.findElement(By.xpath("//fieldset[7]/input[@name='password']")).sendKeys("Testing");
		
		//Submit Button by using Xpath
		//driver.findElement(By.xpath("//fieldset[7]/following-sibling::div/div[2]/input[@type='submit']")).click();
		
		//Submit Button by using List
		driver.findElements(By.cssSelector("input[type='submit']")).get(1).click();
		
		
		
		
	}

}
