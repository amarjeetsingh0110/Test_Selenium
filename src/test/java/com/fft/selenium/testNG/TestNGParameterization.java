package com.fft.selenium.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterization{
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password, String postalCode)
	{
		System.out.println(username + password+ postalCode);
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][3];
		
		data[0][0]="ajsingh0110@gmail.com";
		data[0][1]="Password1";
		data[0][2]="94608";

		data[1][0]="ajsingh0110@gmail.com";
		data[1][1]="Password2";
		data[1][2]="94609";
		
		data[2][0]="ajsingh0110@gmail.com";
		data[2][1]="Password3";
		data[2][2]="94610";
		
		
		
		return data;
		
	}
}
