package com.fft.selenium.old;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SelectDropDown {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
	/*	WebElement element= driver.findElement(By.xpath("//select[@id='continents']"));
		List<WebElement> list= element.findElements(By.tagName("option"));
		System.out.println(list.size());*/
		
		
		Select oSelect= new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		int size=oSelect.getOptions().size();
		oSelect.selectByVisibleText("Navigation Commands");
		/*System.out.println(list.get(0).getText());
		System.out.println(oSelect.getOptions());
		System.out.println(oSelect.getOptions().size());
		System.out.println(list.size());
		*/
		
/*		for(int i=0;i<size; i++)
		{
			System.out.println(oSelect.getOptions().get(i).getText());
		}*/
/*		//oSelect.selectByIndex(1);
		oSelect.selectByValue("EU");
		oSelect.selectByVisibleText("Asia");
		oSelect.selectByVisibleText("Europe");
		oSelect.selectByVisibleText("Antarctica");
		System.out.println("Done");*/
/*		System.out.println(oSelect.getOptions().get(2).getText());
		System.out.println(oSelect.getOptions().get(2).getText());*/
		
		
/*		
		
		System.out.println(oSelect.getOptions().getClass());
		System.out.println(oSelect.getOptions().isEmpty());
		System.out.println(oSelect.getOptions().toString());*/
		
		
		
				
		
		//driver.close();
	}
}
