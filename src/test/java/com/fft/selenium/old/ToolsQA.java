package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolsQA {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		// open the first tab
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		// open the second tab
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		// switch to the previous tab
		/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "" + Keys.SHIFT + "" + Keys.TAB);
		Thread.sleep(2000);*/
	}
}
