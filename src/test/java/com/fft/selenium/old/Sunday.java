package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sunday {
	
	
	WebDriver wb= new ChromeDriver();
	
	
	public void mainFunctionality()
	{

		wb.get("https://www.investing.com/");
		
		wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wb.manage().window().maximize();
		wb.manage().deleteAllCookies();
		
		
		imleWait();
		wb.findElement(By.xpath("//a[@class='login bold'][text()='Sign In']")).click();
		wb.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		wb.findElement(By.cssSelector("#customBtn1 span.text")).click();
		
		
		String ParentWindow= wb.getWindowHandle();
		for(String ChildWindow : wb.getWindowHandles())
		{
			wb.switchTo().window(ChildWindow);
		}			
		
		imleWait();
		wb.findElement(By.xpath("//input[@id='identifierId' and @type='email' and @aria-label='Email or phone']")).sendKeys("ajsingh0110");
		wb.findElement(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")).click();
		
		imleWait();
		wb.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Hardlocked12!");
		wb.findElement(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")).click();
		
		
		//Switching to main window again(Invensting.com)
		wb.switchTo().window(ParentWindow);
		System.out.println(wb.getTitle());
		
		
		imleWait();
		wb.findElement(By.xpath("//a[@class='nav' and text()='Portfolio']")).click();
		imleWait();
		wb.findElement(By.xpath("//li[@id='tab_4168180']")).click();
		//waiting(wb, 50, "//span[@class='threeDotsIcon']");
		imleWait();
		wb.findElement(By.xpath("//span[@class='threeDotsIcon']")).click();
		//wb.findElement(By.xpath("//a[@name='download']")).click();
		
		//waiting(wb, 50, "//a[@class='newBtn Orange2 noIcon float_lang_base_2 Orange js-save']");
		imleWait();

		wb.findElement(By.xpath("//a[@class='newBtn Orange2 noIcon float_lang_base_2 Orange js-save']")).click();
		wb.findElement(By.xpath("//input[@id='download3']")).click();
	}
	
	
	public static void waiting(WebDriver wbd, int waitTime, String path)
	{
		WebDriverWait wait= new WebDriverWait(wbd, waitTime);
/*		wait.until(ExpectedConditions.elementToBeClickable(locator)
				visibilityOfElementLocated(By.xpath(path)));*/
	}
	
	public void imleWait()
	{
		
		wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		Sunday ref= new Sunday();
		ref.mainFunctionality();
	}



}
