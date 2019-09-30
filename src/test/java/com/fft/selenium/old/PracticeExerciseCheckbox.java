package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeExerciseCheckbox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
				
		driver.get("https://stackoverflow.com/questions/15067107/difference-between-webdriver-dispose-close-and-quit");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.manage().logs());
		
		
		
		
		
		
	}

}
