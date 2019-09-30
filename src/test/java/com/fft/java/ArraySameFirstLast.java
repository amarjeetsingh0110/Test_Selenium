package com.fft.java;

import java.util.Scanner;

public class ArraySameFirstLast {
	
	
	static
	{
		System.out.print("Please Enter the Array limit :");
	}
	
	public void acceptValue()
	{
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] array= new int[n];
		System.out.println("You have Selected Array with Length :" +n);
		
		//inserting values in array
		for(int i=0; i<array.length;i++)
		{
			System.out.print("Please Enter Array Index["+i+"] value :");
			array[i]=scan.nextInt();
		}
		
		Boolean value=checkFirstLast(array, n);
		if(value==true)
		{
			System.out.println("Array Length is greater than or equal to One and Array's 1st Element is same as Array's Last Element");
		}
		else
		{
			System.out.println("Either Array length is Zero or Array's 1st Element is not same as Array's Last Element ");
		}
		scan.close();
		
		
	}
	
	
	public boolean checkFirstLast(int[] arrayCopy, int x)
	{
		if(arrayCopy.length>=1 && arrayCopy[0]==arrayCopy[x-1])
		{
			return true;
		}
		
		else
			{return false;}
	}
	
	
	public static void main(String[] args) {
		
		new ArraySameFirstLast().acceptValue();
		
		
	}

}
