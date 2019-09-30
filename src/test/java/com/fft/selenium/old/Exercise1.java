package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("http://toolsqa.com/");
		//driver.findElement(By.xpath("//div[@class='soc-ico show-on-desktop near-logo-first-switch in-menu-second-switch custom-bg hover-accent-bg first last']/a[@href='https://www.facebook.com/tools.qa']")).click();
		//Thread.sleep(2000);
		
		String url="http://toolsqa.com/";
		driver.get(url);
		
		//String pageTitle=driver.getTitle();
		//System.out.println("Title of the page is: " +pageTitle);
		System.out.println("Title of the page is: " +driver.getTitle());
				
		//int  pageLength=driver.getTitle().length();  
		//System.out.println("Length of the page title is: " +pageLength);
		System.out.println("Length of the page title is: " +driver.getTitle().length());
		
				
		//String pageUrl= driver.getCurrentUrl();
		if(url==driver.getCurrentUrl())
		{
			System.out.println("Page url is same as provided.");
		}
		else
		{
			System.out.println("Page url is not same as provided.");
		}
		
		//int sourceLength=driver.getPageSource().length();
		//System.out.println("Length of the page is: " +sourceLength);
		System.out.println("Lengt of the page source is: " +driver.getPageSource().length());
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String url="https://google.com";
		wb.get(url);
		String title= wb.getTitle();
		System.out.println("Page Title: " +title + "   Length of the title is: " +title.length());
		
		String actual= wb.getCurrentUrl();
		System.out.println("Page URL: " +actual+ "    Length of the URL is: " +actual.length());
		
		if(url==actual)
		{
			System.out.println("URL is same");
		}
		else
		{
			{
				System.out.println("URL is not same");
				System.out.println("Actual URL: " +actual);
				System.out.println("Exected URL " +url);
			}
		}
		
		
		String source= wb.getPageSource();
		System.out.println("Length of the Page Souce is: " +source.length());
		
		wb.close();*/
		
	}

}
