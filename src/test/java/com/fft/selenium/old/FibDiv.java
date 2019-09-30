package com.fft.selenium.old;

public class FibDiv {

	public static void main(String[] args) {
		
		int [] n1=new int [30];
		n1[0]=0;
		n1[1]=1;
		int val=5, ren=0;
		//int n = 15, t1 = 0, t2 = 1, num=3, r=0;

		//System.out.println(n1[0]);
		//System.out.println(n1[1]);
		for (int i = 2; i <=16; i++)
        {
			n1[i]=n1[i-1]+n1[i-2];
		//	System.out.println(n1[i]);
			if(n1[i]%val==0)
			{
				ren++;
				if(ren==2)
				{
					System.out.println(n1[i]);
				}
				
			}
        }
		
        }
        
         
	}
