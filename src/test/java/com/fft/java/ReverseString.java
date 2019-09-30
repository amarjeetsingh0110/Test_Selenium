package com.fft.java;

public class ReverseString {

	
	public static void main(String[] args) {
		String str="Hello Everyone";
		String reverse="";
		
		//Code for Reversing the String by using for loop
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
			
		}
		//Printing whole reverse String
		System.out.println(reverse);
		
	}
}
