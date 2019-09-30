package com.fft.java;

import java.util.Scanner;

public class ArrayPracticeInt {

	
	public static void main(String[] args) {
	
		int num,n=0, count=1;
		System.out.print("Enter the Student Limit : ");
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		
		int[] array1= new int[n];
		System.out.println("You have selected "+n+" number of students.");

		for(int i=0;i<array1.length;i++)
		{
			System.out.print("Please Enter student"+(i+1)+" Mobile Numer :");
			num=scan.nextInt();
			array1[i]=num;
		}
		
		for(int mobile:array1) 
		{
			
			System.out.println("Student"+count+" mobile number is :" +mobile);
			count++;
		}
		scan.close();
	
	}
}
