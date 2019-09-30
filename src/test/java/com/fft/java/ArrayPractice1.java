package com.fft.java;

public class ArrayPractice1 {

	public static void main(String[] args) {
		int array[] = new int[10];
		
		int[] array2= {1,2,3,4,5};
		
		
		for(int a:array2)
		{System.out.println(a);}
		
		
		int length=array.length;
		for(int i=0;i<length;i++)
		{
			array[i]=(i*10)+10;
			System.out.println(array[i]);
		}
		//System.out.println(array[0]);
		
		
	}
}
