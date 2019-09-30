package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownBoxPractice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		Select oSelect= new Select(driver.findElement(By.id("continents")));
		oSelect.selectByIndex(1);
		oSelect.selectByVisibleText("Africa");
		
		int size=oSelect.getOptions().size();
		
		for(int i=0;i<size;i++)
		{
			System.out.println(oSelect.getOptions().get(i).getText());
		}
		
	}
}
