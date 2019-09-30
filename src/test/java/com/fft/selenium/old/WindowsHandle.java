package com.fft.selenium.old;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandle {
public static void main(String[] args)  throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
	driver.findElement(By.xpath("//button[text()='click ']")).click();
	
	
	Set<String> handler= driver.getWindowHandles();
	Iterator<String> it= handler.iterator();

	// Switching windows without loop.
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	
	// Switching windows with for loop.
/*	int size=handler.size();
	System.out.println(size);
	
	for(int i=1;i<=size;i++)
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	*/
	
	// Switching windows with for-each loop.
/*	Set<String> allWindows=driver.getWindowHandles();
	for(String childWindows : allWindows)
	{
		driver.switchTo().window(childWindows);
		System.out.println(driver.getTitle());
	}*/
	
	//switching windows by index
	Set<String> allWindows=driver.getWindowHandles();
	driver.switchTo().frame(2);
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	
	
	
	
	
/*	Set<String> handler= driver.getWindowHandles();
	Iterator<String> it= handler.iterator();

	String parentId= it.next();
	System.out.println(parentId);

	String childId= it.next();
	System.out.println(childId);

	String subChildId= it.next();
	System.out.println(subChildId);
	
	driver.switchTo().window(parentId);
	Thread.sleep(5000);
	driver.switchTo().window(subChildId);
	Thread.sleep(5000);
	System.out.println("Over & Out");*/
	
	
	/*	Set<String> allWindowHandles = driver.getWindowHandles();
	 
	for(String handle : allWindowHandles)
	{
		System.out.println("Window handle - > " + handle);
	}
	*/
	
	
}
}
