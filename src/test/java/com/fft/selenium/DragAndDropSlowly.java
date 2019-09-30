package com.fft.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fft.selenium.browser.BrowserLaunch;

public class DragAndDropSlowly {

	WebDriver driver;

	public void slowlyDrag() {
		BrowserLaunch obj = new BrowserLaunch();
		driver = obj.launch();

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
		Actions action = new Actions(driver);

		WebElement dragable = driver.findElement(By.cssSelector("div#draggable"));
		WebElement droppable = driver.findElement(By.cssSelector("div#droppable"));

		
		action.clickAndHold();
		//action.dragAndDrop(dragable, droppable).perform();
		// driver.close();
	}

	public static void main(String[] args) {
		new DragAndDropSlowly().slowlyDrag();
	}
}
