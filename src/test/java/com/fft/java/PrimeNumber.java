package com.fft.java;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=29;
		Boolean flag = null;
		
/*		for(int j=2;j<=i-1;j++)
		{
			if(i%j==0)
			{
				flag=false;
				break;
				//System.out.println("Prime Number");
			}
			else
			{ 
				flag=true;
				break;
			}
				
		}
		if(flag==true)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime");
		}
		*/
		
		//PrimeNumber.verify(29);
		if(PrimeNumber.verify(28))
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
	}
	
	// Method with return type to find out whether the number is PRIME or NOT PRIME
	public static boolean verify(int n)
	{
		for(int i=2; i<=n-1;i++)
		{
			if(n%i==0)
			{
				return false;	
			}
		}
		return true;
		
		
			}
	
}
