package com.fft.selenium.old;
import java.util.HashMap;
import com.fft.selenium.browser.*;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FacebookExercise1 {

	public static void main(String[] args) throws InterruptedException {

		BrowserLaunch obj= new BrowserLaunch();
		WebDriver driver=obj.launch();
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9899784211");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Focusonyourgoals@1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		/*Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();

        // Set the experimental option
		options.setExperimentalOption("prefs", prefs);
		*/
		
		
		driver.findElement(By.xpath("//textarea[@name='xhpc_message']")).sendKeys("Hello Guyz");
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		
		
		
		
		
	}
}
