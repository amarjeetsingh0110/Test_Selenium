package com.fft.java;

import java.util.Date;

public class Average {

	public static int avg(int a, int b)
	{
		return a*b/2;
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		Date start= new Date();
		int a=avg(10,20);
		System.out.println(start.getTime());
		System.out.println(a);
		//Thread.sleep(2000);
		Date start1= new Date();
		System.out.println(start1.getTime());
	}
}