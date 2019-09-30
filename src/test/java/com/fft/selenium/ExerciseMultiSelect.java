package com.fft.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciseMultiSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		Select selectElement = new Select(driver.findElement(By.cssSelector("select[multiple='multiple']")));
		
		selectElement.deselectAll();
		
		WebElement textArea=driver.findElement(By.cssSelector("textarea[name='comments']"));
		textArea.clear();
		
		selectElement.selectByVisibleText("Selection Item 1");
		selectElement.selectByVisibleText("Selection Item 2");
		selectElement.selectByVisibleText("Selection Item 3");

		
		List<WebElement> element=selectElement.getAllSelectedOptions();
		
		for(int i =0; i<element.size(); i++)
		{
			System.out.println(element.get(i).getText());
			textArea.sendKeys(element.get(i).getText());
		}
		
	
		
		
	
	}
}
