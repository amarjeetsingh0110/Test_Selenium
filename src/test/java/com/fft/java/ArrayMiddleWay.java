package com.fft.java;

public class ArrayMiddleWay {

	
	public static void main(String[] args) {
	
		int []a= {1,2,3};
		int []b= {4,5,6};
		
		
		int []c= new int[2];
		
		for(int i=0;i<a.length-1;i++)
		{
			if(i==0)
			{
				c[i]=a[i+1];
			}
			else
			{
				c[i]=b[i];
			}
			System.out.println(c[i]);
		}
		
	}
	
	
}
