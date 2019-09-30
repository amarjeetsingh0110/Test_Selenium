package com.fft.java;

import java.util.Scanner;

public class ArrayPracticeString {
	
	public static void main(String[] args) {
		int n=0, count=1;
		String name;
		System.out.print("Enter the Student Limit : ");
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
		
		n=scan.nextInt();
		
		String array1[]= new String[n];
		System.out.println("You have selected "+n+" number of students.");

		for(int i=0;i<array1.length;i++)
		{
			System.out.print("Please Enter student"+(i+1)+" name :");
			name=scan1.nextLine();
			array1[i]=name;
		}
		
		//With while loop
		int j=0; 
		while(j<array1.length)
		{
			System.out.println("Student"+count+" name is :" +array1[j]);
			j++;
		}
		/*for(String loop:array1) 
		{
			System.out.println("Student"+count+" name is :" +loop);
			count++;
		}*/
		scan.close();
	}
}
