package collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.javatpoint.com/collections-in-java");
		driver.manage().window().maximize();
		
		
		/*List<WebElement> list= new ArrayList<WebElement>();
		list=driver.findElements(By.tagName("a"));
		System.out.println("Total links available on the webpage are : " +list.size());
		
		for(WebElement element:list)
		{
			System.out.println(element.getAttribute("href"));
		}
		*/
		
		List<WebElement> list= new ArrayList<WebElement>();
		list=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links available on the webpage are : " +list.size());
		List<String> links= new ArrayList<String>();
		for(WebElement element:list)
		{
			links.add(element.getAttribute("href"));
			
		}
		HashSet<String> list2= new HashSet<String>(links);
		System.out.println("Total unique links available on the webpage are : " +list2.size());
		
		
		//driver.quit();
	}
	
	
	
	
	

}