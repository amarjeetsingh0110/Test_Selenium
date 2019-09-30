package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultipleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		Select oSelect= new Select(driver.findElement(By.id("selenium_commands")));
		
		oSelect.selectByIndex(0);
		oSelect.selectByVisibleText("Navigation Commands");
		oSelect.selectByVisibleText("WebElement Commands");
		
		oSelect.deselectByIndex(0);
		oSelect.deselectByVisibleText("Navigation Commands");
		oSelect.deselectByVisibleText("WebElement Commands");
		
		
		
	}
	
	

}
