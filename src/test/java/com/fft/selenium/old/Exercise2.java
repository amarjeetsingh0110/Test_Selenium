package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("http://toolsqa.com/selenium-training/?homepage");
		Thread.sleep(3000);
		//WebElement e=driver.findElement(By.xpath("//a[@href='http://www.toolsqa.com/selenium-training/?homepage' and text()='Enroll Your Self']"));
		WebElement e=driver.findElement(By.name("your-name"));
		e.sendKeys("Amarjeet Singh");
		Thread.sleep(2000);
		e.clear();
		
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
	}
}
