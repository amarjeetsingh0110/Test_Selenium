package com.fft.java;

import java.util.Scanner;

public class ArrayFirstLastNum {
	static int n;
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Please Enter limit of Array : ");
		n= scan.nextInt();
		
		System.out.println("You have selected Array with a length of "+n);
		int []array=new int[n];
		
		for(int i=0;i<array.length;i++)
		{
			int number;
			System.out.print("Please Enter Index["+i+"] value : ");
			number=scan.nextInt();
			array[i]=number;
		}
		
		ArrayFirstLastNum obj= new ArrayFirstLastNum();
		Boolean result=obj.fistLast(array);
		System.out.println(result);
		
		
		/*System.out.println("Arrays if Full");
		System.out.println("Printing of Array");
		
		for(int print:array)
		{
			System.out.println(print);
		}
		*/
		scan.close();
	}
	
	
	public boolean fistLast(int []a)
	{
		if(a[0]==6|| a[n-1]==6)
		{
			return true;	
		}
		
		else
		{
			return false;
		}
	}

}
