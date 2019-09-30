package com.fft.java;

public class Array3D {

	static int value=0;
	public static void main(String[] args) {
		int [][][] array= new int[2][3][4];
		
		//Testing
		
		
	/*	System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[0][0].length);
		System.out.println(array[1][2].length);*/
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				for(int k=0;k<array[i][j].length;k++)
				{
					
					array[i][j][k]=value+5;
					value=value+5;
				}
					
			}
		}
		
		int p1=0;
		for(int [][]a:array)
		{
			int p2=0;
			for(int []b:a)
			{
				int p3=0;
				for(int c: b)
				{
					System.out.println("Array["+p1+"]["+p2+"]["+p3+"]===>>" +c);
					p3=p3+1;
				}
				p2=p2+1;
			}
			p1=p1+1;
		}
		
		
		
/*		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				for(int k=0;k<array[i][j].length;k++)
				{
					System.out.println("Array["+i+"]["+j+"]["+k+"]==>> "+array[i][j][k]);
				}
			}
		}*/
	}
}






























