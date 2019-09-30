package com.fft.java;

public class NestedFor {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				for(int k=1;k<=2;k++)
				{
					System.out.println("i==>>"+i+ "; J==>>" +j+ "; K==>>"+k);
				}
			}
		}
	}
}
