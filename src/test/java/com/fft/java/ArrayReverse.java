package com.fft.java;

import java.util.Scanner;

public class ArrayReverse {

	
	public static void main(String[] args) {
		int n=0;
		Scanner scan= new Scanner(System.in);
		System.out.print("Please Enter limit of Array : ");
		n= scan.nextInt();
		
		System.out.println("You have selected Array with a length of "+n);
		int []array=new int[n];
		
		for(int i=0;i<array.length;i++)
		{
			//int input=0;
			System.out.print("Please Enter Array["+i+"] index value :");
			array[i]=scan.nextInt();
		}
		
		for(int j=array.length-1;j>=0;j--)
		{
			System.out.println(array[j]);
		}
		scan.close();
	}
}