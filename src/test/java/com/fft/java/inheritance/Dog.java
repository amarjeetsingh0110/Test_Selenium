package com.fft.java.inheritance;

public class Dog extends Animal{
	
	
	public static void main(String[] args) {
	
		Cat obj= new Cat ();
		obj.sound();
		
	}
	
	public void sound()
	{
		System.out.println("Dog Sound");
	}

}
