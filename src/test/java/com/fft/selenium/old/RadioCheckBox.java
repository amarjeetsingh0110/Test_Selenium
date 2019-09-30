package com.fft.selenium.old;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioCheckBox {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement radio=driver.findElement(By.xpath("//label[@for='sex-1']"));
		Boolean check=radio.isSelected();
		if (check==false) 
		{
			radio.click();
		}
		
		driver.findElement(By.xpath("//input[@id='exp-2']")).click();
		
		List<WebElement> checkbox= driver.findElements(By.name("profession"));
		int size=checkbox.size();
		System.out.println(size);
		for(int i=0; i<size; i++)
		{
			String name=checkbox.get(i).getAttribute("value");
			System.out.println(name);
			if(name.equalsIgnoreCase("Automation Tester"))
			{
				checkbox.get(i).click();
			}
		}
		driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
		
		
	}

}
