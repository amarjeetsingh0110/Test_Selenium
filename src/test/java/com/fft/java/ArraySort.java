package com.fft.java;

public class ArraySort {
	
	public static void main(String[] args) 
	{
		int []a= {10,4,6,50,5,33,2,3,-9};
		int temp=0;
		
		for(int i=0;i<9;i++)
		{
			for(int j=i+1; j<9;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<9;i++)
		{
			System.out.println(a[i]);
			
		}
	}

}
