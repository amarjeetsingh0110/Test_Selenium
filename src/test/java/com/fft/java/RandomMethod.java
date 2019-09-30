package com.fft.java;

public class RandomMethod {

	public static void main(String[] args) {
		
		int array[]=new int[3];
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*10000);
			if(array[i]>999 && array[i]<10000)
			{
				System.out.println(array[i]);	
			}
			else
			{
				i--;
			}
		}
				
	}
}
