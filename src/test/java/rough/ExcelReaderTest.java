package rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReaderTest {
	public WebDriver driver=null;
	
	public static void main(String[] args)  {
	
	}
	
	@BeforeTest
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test(dataProvider="getData")
	public void test(String firstName, String lastName, String email) throws InterruptedException
	{
		
		//System.out.println("First Name :" +firstName+"		Last Name :"+lastName+"		Email :" +email);
		driver.get("https://form.jotform.me/ajsingh0110/email_signup_form");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q1_firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='q17_lastName17']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='q2_E_mail_']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='reset']")).click();
		}

	
	
	@DataProvider
	public Object[][] getData()
	{
		ExcelReader excel= new ExcelReader("./src/test/resources/excel/Test.xlsx");

		int rowsNum=excel.getRowCount("Sheet1");
		int colsNum=excel.getColumnCount("Sheet1");
		
		Object[][] data= new Object[rowsNum-1][colsNum];
		
		for(int row=2;row<=rowsNum;row++)
		{
			for(int col=0;col<colsNum;col++)
			{
				data[row-2][col]=excel.getCellData("Sheet1", col, row);
			}
		}
		
		/*System.out.println(excel.getCellData("Sheet1", 0, 2));
		System.out.println(excel.getCellData("Sheet1", 1, 2));
		System.out.println(excel.getCellData("Sheet1", 2, 2));*/
		
		/*data[0][0]= excel.getCellData("Sheet1", 0, 2);
		data[0][1]= excel.getCellData("Sheet1", 1, 2);
		data[0][2]= excel.getCellData("Sheet1", 2, 2);
		
		data[1][0]= excel.getCellData("Sheet1", 0, 3);
		data[1][1]= excel.getCellData("Sheet1", 1, 3);
		data[1][2]= excel.getCellData("Sheet1", 2, 3);
		
		data[2][0]= excel.getCellData("Sheet1", 0, 4);
		data[2][1]= excel.getCellData("Sheet1", 1, 4);
		data[2][2]= excel.getCellData("Sheet1", 2, 4);
		
		data[3][0]= excel.getCellData("Sheet1", 0, 5);
		data[3][1]= excel.getCellData("Sheet1", 1, 5);
		data[3][2]= excel.getCellData("Sheet1", 2, 5);
		*/
		
		return data;
		
	}
	

}
