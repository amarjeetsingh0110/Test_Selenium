package com.fft.java;
import java.util.Scanner;


public class FindMissingNumber {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.print("Please Enter the Array Length : ");
		int n= scan.nextInt();
		System.out.print("Please Enter a Number to be found : ");
		int numberToFound=scan.nextInt();
		
		scan.close();
		
		int sum=0;
		int array[]= new int[n];
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=i+1;
			if(array[i]==numberToFound)
			{
				continue;
			}
			sum=sum+array[i];
			System.out.println(array[i]);
		}
		//System.out.println("Sum is: "+sum);
		
		n=n*(n+1)/2;
		
		System.out.println("Missing Number is : "+(n-sum));
	}

}