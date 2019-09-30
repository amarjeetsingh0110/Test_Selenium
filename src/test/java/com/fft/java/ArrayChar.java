package com.fft.java;

import java.util.Scanner;

public class ArrayChar {
	
	public static void main(String[] args) {
		
		char[] array= new char[10];
		Scanner scan= new Scanner(System.in);
		
		for(int i=0;i<array.length;i++)			
		{
			
			array[i]=68;
			System.out.println(array[i]);
		}
	}

}
