package com.fft.selenium.old;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.makemytrip.com/");
	//driver.findElement(By.xpath("//li[@id='deals_live_deals']"));
	
	
	Actions action= new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//li[@id='deals_live_deals']"));
	
	action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	/*action.contextClick(element).build().perform();
	Thread.sleep(3000);
	action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);*/
	//driver.findElement(By.linkText("Inspect")).click();
	
}
}
