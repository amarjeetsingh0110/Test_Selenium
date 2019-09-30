package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise3 {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//driver.get("http://toolsqa.com/automation-practice-form/");
	driver.get("http://toolsqa.com/automation-practice-form/");
	driver.findElement(By.partialLinkText("Partial")).click();
	String print=driver.findElement(By.tagName("button")).toString();
	System.out.println(print);
	driver.findElement(By.linkText("Link Test")).click();
	/*WebElement element=driver.findElement(By.xpath("//a[@href='http://arunrajvdm.blogspot.com/2014/07/how-to-store-text-of-element-in.html' and @title='Newer Post']"));
	String value= element.getAttribute("title").toString();*/
	
	//String value=
	//System.out.println(driver.findElement(By.xpath("//input[@type='submit'][@value='Subscribe']")).getAttribute("type"));
	//System.out.println(b);
	/*Point point = element.getLocation();
	System.out.println("X Cordinate :" +point.x +  " Y Cordinate :" +point.y );
	*///System.out.println(value);
	
	driver.close();

	
}
}

