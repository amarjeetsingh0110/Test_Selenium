package com.fft.selenium.old;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowsAlerts {

	WebDriver driver;

	public void driverLoading() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse\\Workspace\\Test_Selenium\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		pathFinder();

	}

	public void pathFinder() throws InterruptedException {
		driver.findElement(By.id("button1")).click();
		windowHandler();

	}

	public void windowHandler() throws InterruptedException {
		String parent = driver.getWindowHandle();
		System.out.println(driver.switchTo().window(parent).getTitle());

		Set<String> handler = driver.getWindowHandles();
		for (String child : handler) {
			if (!parent.equals(child)) {

				System.out.println(driver.switchTo().window(child).getTitle());
				driver.close();
			}
			driver.switchTo().window(parent);
			Thread.sleep(3000);
		}
		
		System.out.println(driver.switchTo().window(parent).getTitle());
	}

	public static void main(String[] args) throws InterruptedException {

		SwitchWindowsAlerts object = new SwitchWindowsAlerts();
		object.driverLoading();

	}

}
