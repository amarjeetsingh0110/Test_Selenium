
package com.fft.selenium.old;
import java.util.List;

//import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all");
		
		driver.findElement(By.xpath("//button[text()='Run SQL �']")).click();
		
		String beforeXpath="//table[@class='w3-table-all notranslate']/tbody/tr[";
		String afterXpath="]/td[2]";
		Thread.sleep(2000);
		List<WebElement> element= driver.findElements(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr"));
		int listSize=element.size();
		System.out.println(listSize);
		
		//Logic to find an element from WebTable through for loop. >>>> SLOW >>> Takes 5 seconds after the WebElement load.
		for(int i=2;i<=listSize;i++ )
		{
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement mainElement= driver.findElement(By.xpath(actualXpath));
			if(mainElement.getText().equalsIgnoreCase("Wolski"))
			{System.out.println("Customer Name :"+mainElement.getText() +" found");}
			
		}
		
		//Logic to find an element from WebTable through following-sibling Xpath. >>>> FAST >> Less than .5 seconds.
		WebElement element1=driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr/td[text()='91']/following-sibling::td[1]"));
		System.out.println("Customer Name :"+element1.getText() +" found");
		
		//Logic to find an element from WebTable through preceding-sibling Xpath. >>>> FAST >> Less than .5 seconds.
		WebElement element2=driver.findElement(By.xpath("//table[@class='w3-table-all notranslate']/tbody/tr/td[text()='Zbyszek']/preceding-sibling::td[1]"));
		System.out.println("Customer Name :"+element2.getText() +" found");
		
		driver.close();
		
	}
}
