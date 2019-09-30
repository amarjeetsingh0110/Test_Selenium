package com.fft.java;

public class TwoDArray {
	static int num=0;
	public static void main(String[] args) {
		int[][] array=new int[4][5];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				num=num+10;
				array[i][j]=num;
			}
		}
		
		for(int[] a:array)
		{
			for(int b: a)
			{
				System.out.println(b);
			}
		}
		
		/*for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.println(array[i][j]);
			}
		}*/
	}

}
