package rough;


import java.util.*;

public class Demo 
{
	public static void main(String[] args)
	{
		String a,b,c,tmp1, tmp2, tmp3;
		a="AVTVA";
		b="DALDA";
		c="ATOYOTA";
		tmp1="";
		tmp2="";
		tmp3="";
		int length1 = a.length();   int length2 = b.length();int length3 = c.length();
	    for( int i = length1 - 1; i >= 0; i-- )  
	      { 
	    	tmp1 = tmp1 + a.charAt(i);
	      }
	      if(a.equals(tmp1))  
	         
	    	  System.out.println("Entered string is a palindrome."+a);
	         
	      else  
	         System.out.println("Entered string isn't a palindrome.");   
	      for( int i = length2 - 1; i >= 0; i-- )  
	      { 
	    	tmp2 = tmp2 + b.charAt(i);
	      }
	      if(b.equals(tmp2))  
	         
	    	  System.out.println("Entered string is a palindrome."+b);
	         
	      else  
	         System.out.println("Entered string isn't a palindrome.");   
	      for( int i = length3 - 1; i >= 0; i-- )  
	      { 
	    	tmp3 = tmp3 + c.charAt(i);
	      }
	      if(c.equals(tmp3))  
	         
	    	  System.out.println("Entered string is a palindrome." +c);
	         
	      else  
	         System.out.println("Entered string isn't a palindrome.");   
			
		
	}	
}