package com.fft.selenium;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fft.selenium.browser.BrowserLaunch;

public class W2AWindows {
	
	WebDriver driver;
	Iterator<String> it;
	Set<String> windowsIds;
	Date date;
	
	public void screenCapture() throws IOException
	{
		date= new Date();
		String fileName=(date.toString().replace(":", "_").replace(" ", "_")+".jpg");
		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("./Screenshots/"+fileName));
	}
	

	
	public void windows() throws IOException 
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
		
		screenCapture();
		/*//Taking Screenshot
		File screenshotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshotFile, new File("./Screenshots/Screenshot01.jpg"));*/
		
		driver.findElement(By.cssSelector("a[href='#login']")).click();
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("ajsingh0110");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Hardlocked1!");
		driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();
		String parent= driver.getWindowHandle();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		
		Boolean b= wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='fancybox-overlay fancybox-overlay-fixed']")));
		if(b)
		{
			WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Frames and Windows']")));
			element.click();
				
		}
		
		
		//Code for Open Frames and Windows
		driver.switchTo().frame(driver.findElement(By.xpath(("(//iframe[@class='demo-frame'])[1]"))));
		driver.findElement(By.xpath("//a[text()='New Browser Tab']")).click();
		it=windowHandler();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next()).close();
		
		//Code for Open Separate New Window
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='Open Seprate New Window']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath(("(//iframe[@class='demo-frame'])[2]"))));
		driver.findElement(By.xpath("//a[text()='Open New Seprate Window']")).click();
		it=windowHandler();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next()).close();
			
		//Code for Open FrameSet
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='Frameset']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath(("(//iframe[@class='demo-frame'])[3]"))));
		driver.findElement(By.xpath("//a[text()='Open Frameset Window']")).click();
		it=windowHandler();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next()).close();
		
		//Code for Open Multiple Windows
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='Open Multiple Windows']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath(("(//iframe[@class='demo-frame'])[4]"))));
		driver.findElement(By.xpath("//a[text()='Open multiple pages']")).click();
		
		it=windowHandler();
		for(String child:windowsIds)
		{
			if(parent.equals(child))
			{
				
			
			}
			else
			{
				driver.switchTo().window(child);
				driver.close();
			}
			
		}
		
		
		
	}
	
	public Iterator<String> windowHandler()
	{
		windowsIds=driver.getWindowHandles();
		it=windowsIds.iterator();
		return it;
		
		
	}
	
	
	public static void main(String[] args) throws IOException{
		new W2AWindows().windows();
	}
}