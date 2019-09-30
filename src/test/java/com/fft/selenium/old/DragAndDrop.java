package com.fft.selenium.old;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement from= driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement to= driver.findElement(By.xpath("//div[@id='column-2']"));
		
		Actions builder= new Actions(driver);
		builder.dragAndDrop(from, to).build().perform();
		
		
	}
}
