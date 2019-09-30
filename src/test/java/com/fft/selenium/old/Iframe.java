package com.fft.selenium.old;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Amarjeet Singh");
		//driver.findElement(By.xpath("//input//[@name='author']")).sendKeys("Amarjeet Singh");		
		
		/*driver.switchTo().frame("IF2");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
		*/
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='trigger-overlay'][@href='#go']")).click();

	}
}
