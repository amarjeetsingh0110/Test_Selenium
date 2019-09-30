package com.fft.selenium;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import com.fft.selenium.browser.BrowserLaunch;


public class Naukri {
	
	
	WebDriver driver;
	Iterator<String> it;
	static Set<String> windowsIds;
	
	public void switchWindows()
	{
		BrowserLaunch obj= new BrowserLaunch();
		driver=obj.launch();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		
		
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
		windowsIds= driver.getWindowHandles();
		it=windowsIds.iterator();
		return it;
		
	}
	
	public static void main(String[] args) {
		new Naukri().switchWindows();
	}
}

		