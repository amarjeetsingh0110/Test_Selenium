package com.fft.java;

import java.util.Scanner;

public class RotateLeft3 {
	
	/*public int[] rotateLeft()
	{
		return array;
	}
*/
	public static void main(String[] args) {
		int n=0;
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
		
		int temp =array[0];
		array[0]=array[array.length-1];
		array[array.length-1]=temp;
		
		for(int j=0;j<array.length;j++)
		{
			
			System.out.println(array[j]);
		}
		scan.close();
	}
	
}
