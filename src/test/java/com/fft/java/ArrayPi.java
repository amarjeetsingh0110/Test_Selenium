package com.fft.java;

public class ArrayPi {

	public static void main(String[] args) {
		//System.out.println(Math.PI);
		
		int pi=(int)(Math.PI*100);
		
		int[] array= new int[3];
		for(int i=array.length;i>0;i--)
		{
			array[i-1]=pi%10;
			pi=pi/10;
		}
		for(int a:array)
		{
			System.out.println(a);
		}
}

	public int[] makePi() 
	{
		
		return null;
	    
	}

}