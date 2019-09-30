package com.fft.java;

public class Excercise {
	
	public static void main(String[] args) {
	
		
		
		
		String str= "T is awesome";
		
	//	System.out.println(str.length()>=3 && str.substring(0, 4).equals("This"));
		if(str.length()>=3 && str.substring(0, 4).equals("This"))
		{
			System.out.println("Given String is started with This, so no change is required ");
		}
		
		else
		{
			
			System.out.println("Given String is not started with This, so new string is :  This "+str);
		}
		
		
				
	
	}
}
