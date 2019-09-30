package com.fft.java;

public class ArrayMakeEnds {
	static int []b=new int[2];
	public static void main(String[] args) {
		
		int []a= {7};
		
		
		b=new ArrayMakeEnds().makeEnds(a);
		
		for(int x:b)
		{
			System.out.println(x);
			
		}
	}

	public int[] makeEnds(int[] nums) {
		
				if(nums.length==1)
				{
					  for(int i=0;i<nums.length+1;i++)
					  {
					    b[i]=nums[0];
					  }
					}
				else
				{
				for(int i=0;i<nums.length;i++)
				{
					if(i==0)
					{
						b[0]=nums[i];
					}
						else if(nums.length==1)
					{
					  b[1]=nums[0];
					}
					else if(i==(nums.length-1))
					{
						b[1]=nums[nums.length-1];
						//System.out.println(b[1]);
					}
				
				}
				}
				return b;
		}
	
	/*	
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
				b[0]=a[i];
				System.out.println(b[i]);
			}
			else if(i==(a.length-1))
			{
				b[1]=a[a.length-1];
				System.out.println(b[1]);
			}
			else if(a.length==1)
			{
			  b[1]=a[0];
			  System.out.println(b[1]);
			}
		}*/
		
	
	
}
