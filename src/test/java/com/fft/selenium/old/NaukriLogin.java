package com.fft.selenium.old;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NaukriLogin {

	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		Set<String> handler= driver.getWindowHandles();
		
		for (String child : handler) 
		{
			if(!parent.equals(child))
			{
			driver.switchTo().window(child);
			Thread.sleep(2000);
			driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ajsingh0110@gmail.com");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("Hardlocked1!");
		driver.findElement(By.xpath("//button[@type='submit'][text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@name='qp']")).sendKeys("qa testing");
		driver.findElement(By.xpath("//input[@name='ql']")).sendKeys("Noida");
		driver.findElement(By.xpath("//input[@id='expDroope-experienceFor']")).click();
		driver.findElement(By.xpath("//div[@id='ul_expDroope-experience']/ul/li[10]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Salary']")).click();
		driver.findElement(By.xpath("//div[@id='ul_salaryDroope-salary']/ul/li[12]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String parent1 = driver.getWindowHandle();
		
		List<WebElement> list= driver.findElements(By.xpath("//div[@type='tuple']"));
		System.out.println(list.size());
		
		for(int i=1; i<=list.size();i++)
		{
			driver.findElement(By.xpath("//span[@count='"+i+"']")).click();
			Set<String> handler1=driver.getWindowHandles();
			//System.out.println(handler1.size());
			for(String child1: handler1)
			{
				if(!parent1.equals(child1))
				{
				//Thread.sleep(3000);
				driver.switchTo().window(child1);
				System.out.println(driver.getTitle());
				System.out.println("Company name :" +driver.findElement(By.xpath("//a[@id='jdCpName']")).getText());
				System.out.println("Total Views for this job are: " +driver.findElement(By.xpath("//span[@class='fr jViews']/strong")).getText());
				System.out.println("Total Job Applicants for this job are: " +driver.findElement(By.xpath("//span[@class='fr jApplys']/strong")).getText());
				System.out.println("=================================================================================");
				driver.close();
				driver.switchTo().window(parent1);
				}
			}
		}
		
		driver.quit();
/*		driver.findElement(By.xpath("//span[@count=1]")).click();
		Set<String> handler1= driver.getWindowHandles();
		
		for (String child : handler1) 
		{
			driver.switchTo().window(child);
		}
		
		System.out.println(driver.findElement(By.xpath("//div[@class='hdSec']/h1")).getText());
		System.out.println("Total Views for this job are: " +driver.findElement(By.xpath("//span[@class='fr jViews']/strong")).getText());
		System.out.println("Total Job Applicants for this job are: " +driver.findElement(By.xpath("//span[@class='fr jApplys']/strong")).getText());*/
		
	/*	
	 
	 
		Thread.sleep(3000);
		driver.quit();
		*/
		
		
		
		
		//Thread.sleep(10000);
		//driver.switchTo().frame("lgnFrmNew");
//		driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys("ajsnigh0110@gmail.com");
//		driver.findElement(By.name("PASSWORD")).sendKeys("Hardlocked12!");
//		driver.findElement(By.xpath("//button[@type='submit'][text()='Login']")).click();
//	
		/*driver.get("https://www.goibibo.com/");
		
		String parent = driver.getWindowHandle();
		Set<String> handler= driver.getWindowHandles();
		
		for (String child : handler) 
		{
			if(!parent.equals(child))
			{
			driver.switchTo().window(child);
			//Thread.sleep(2000);
			driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.linkText("Sign In")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("authiframe");
		driver.findElement(By.id("authMobile")).sendKeys("9899784211");		
		driver.findElement(By.id("mobileSubmitBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='authCredentialPassword' ][@placeholder='Password']")).sendKeys("HHardlocked1!");
		driver.findElement(By.id("authCredentialPasswordSignInBtn")).click();*/
			
	//	9899784211
		
		
//		driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys("ajsnigh0110@gmail.com");
//		driver.findElement(By.name("PASSWORD")).sendKeys("Hardlocked12!");
//		driver.findElement(By.xpath("//button[@type='submit'][text()='Login']")).click();
//		
		
	}
}

