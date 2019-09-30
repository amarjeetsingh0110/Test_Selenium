package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragDrop {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	
	driver.findElement(By.xpath("//div[@id='treebox1']/descendant::span[text()='Teens']/preceding::td[3]")).click();
	WebElement from= driver.findElement(By.xpath("//div[@id='treebox1']/descendant::span[text()='Ann Brashares']"));
	WebElement to= driver.findElement(By.xpath("//div[@id='treebox2']/descendant::span[text()='Fiction & Fantasy']"));
	
	Actions builder= new Actions(driver);
	Thread.sleep(2000);
	builder.dragAndDrop(from, to).build().perform();
	//Action dragAndDrop= builder.clickAndHold(from).moveToElement(to).release(to).build();
	Thread.sleep(2000);
	System.out.println("Done");
	
	
	
}
}
