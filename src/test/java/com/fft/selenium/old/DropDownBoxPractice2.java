package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownBoxPractice2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	Select oSelect= new Select(driver.findElement(By.name("selenium_commands")));
	
	oSelect.selectByIndex(0);
	Thread.sleep(2000);
	oSelect.deselectByIndex(0);
	Thread.sleep(2000);
	
	oSelect.selectByVisibleText("Navigation Commands");
	Thread.sleep(2000);
	oSelect.deselectByVisibleText("Navigation Commands");
	Thread.sleep(2000);
	
	int size= oSelect.getOptions().size();
	
	for(int i=0;i<size;i++)
	{
		oSelect.selectByIndex(i);
		System.out.println(oSelect.getOptions().get(i).getText());
	}
	//oSelect.deselectAll();
	
	for (int i=0;i<size;i++)
	{
		oSelect.deselectByIndex(i);
	}
	
}

}
