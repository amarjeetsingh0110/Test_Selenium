package com.fft.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Github\\Repository\\Test_Selenium\\Test_Selenium\\Browser\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Testing");
		/*driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.DELETE);*/
		
		
		WebDriverWait wait= new WebDriverWait(driver, 5);
		WebElement element= driver.findElement(By.cssSelector("ul.erkvQe"));
		wait.until(ExpectedConditions.visibilityOf(element));
		List<WebElement> list = driver.findElements(By.cssSelector("div[class='sbl1']>span"));
		
		for(int i=1;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		
		//driver.close();
		
		
		
	}
}
