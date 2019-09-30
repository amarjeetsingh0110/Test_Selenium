package com.fft.java;

public class TwoDArrayPractice {
public static void main(String[] args) {
	int[][] array= new int[3][];
	
	array[0]= new int[2];
	array[1]= new int [4];
	
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array[i].length;j++)
		{
			array[i][j]=10;
			System.out.println(array[i][j]);
			
		}
	}
	
	for(int[] a:array)
	{
		for(int b: a)
		{
			System.out.println(b);
		}
	}
		
}
}
