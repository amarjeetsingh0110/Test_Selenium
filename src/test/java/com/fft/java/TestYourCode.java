package com.fft.java;

public class TestYourCode {

	public static void main(String[] args) 
	{
		int[] arr= {10,4,6,50,40,5};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			if(i==5)
			{
				break;
			}
			
			if(temp>arr[i+1])
			{
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			
			
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
		
	}

}
