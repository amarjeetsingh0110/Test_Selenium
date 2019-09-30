package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvisibleButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	
	Boolean b= driver.findElement(By.xpath("//button[contains(@style,'hidden')]")).isDisplayed();
	//Boolean b=element.isDisplayed();
	System.out.println(b);
	
	/*Boolean b2= driver.findElement(By.xpath("//button[contains(@style,'visible')]")).isDisplayed();
	System.out.println(b2);
	*/
	
}
}
