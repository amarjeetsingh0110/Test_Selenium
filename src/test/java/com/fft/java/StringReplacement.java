package com.fft.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringReplacement
{

	static void replacement(String str) 
	{
		//String str="Java is Totally Fun";
		String replacement="";
		
		
		for(int i=0; i<str.length();i++)
		{
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				replacement+="M";
			}
			else
			{
				replacement+=str.charAt(i);
			}
			
		}
		System.out.print(replacement);
		
	}
	
	
public static void main(String[] args) throws IOException {
	String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input a string");
    str=br.readLine();
    
    StringReplacement.replacement(str);
    
    
}
	
	
	
	
	
	
	
	
	
	
	
	
}	
