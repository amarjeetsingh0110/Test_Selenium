package com.fft.java;

public class BreakAndContinue {

	public static void main(String[] args) {
		System.out.println(":::::Continue Example:::::");
		for (int i = 1; i <= 10; i++) {
			if (i == 7) 
			{
				System.out.println("Skipping Number :" + i);
				continue;
			}
			System.out.println(i);
		}
		
		
		System.out.println("\n:::::Break Example:::::");
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{break;}
			System.out.println(i);
		}
		
		
	}
}
