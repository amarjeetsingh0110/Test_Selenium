package com.fft.java;

import java.util.Scanner;

public class MissingChar {

	public static void main(String[] args) {
	/*	String str="Amarjeet";
		String str1, str2="";
		
		int n=2;
		str1=str.substring(0, n-1);
		str2=str.substring(n,str.length());
		
		System.out.println(str1+str2);
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Please Enter the String : ");
		String str=scan.nextLine();
		String[] ar;
		ar=new String[str.length()];
		
		System.out.print("Please Enter the Position wants to remove from the String : ");
		int position= scan.nextInt();
		//++position;
		
	//	char ch[]= str.toCharArray();
	
		for(int i=0;i<str.length();i++)
		{
			ar[i]= str.substring(i,i+1);
			
		}
		
			for(int j=0;j<ar.length;j++)
			{
				if(j==position-1)
				{
					continue;
				}
				System.out.print(ar[j]);
			
		}
		
		
	}
}
