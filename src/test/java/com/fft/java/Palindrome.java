package com.fft.java;

public class Palindrome {
	public static void main(String[] args) {
		String str="redivider";
		String reverse="";
		
		
		//Code for Reversing the String by using for loop
		for (int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		
		
		if(str.equals(reverse))   // Comparing whether the String is Palindrome.
			{
				System.out.println("String is Palindrome");
			}
			else
			{
				System.out.println("String is not Palindrome");
			}
		
	}

}
