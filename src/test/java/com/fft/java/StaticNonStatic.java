package com.fft.java;

/*public class StaticNonStatic{
	   public static void main(String args[]){
	     Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();
	     Student.b++;
	     s1.showData();
	  }
	}

	class Student {
	int a; //initialized to zero
	static int b; //initialized to zero only when class is loaded not for each object created.

	  Student(){
	   //Constructor incrementing static variable b
	   b++;
	  }

	   public void showData(){
	      System.out.println("Value of a = "+a);
	      System.out.println("Value of b = "+b);
	   }
	   
	//public static void increment(){
	//a++;
	//}

	}*/


public class StaticNonStatic {
	static int i;
	int j=10;

	public static void main(String[] args) {
		
		StaticNonStatic obj1= new StaticNonStatic();
		StaticNonStatic obj2= new StaticNonStatic();
		obj2.i=20;
		StaticNonStatic obj3= new StaticNonStatic();
		obj3.i=2330;
		obj1.m1();
		
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj3.i);
		obj1.m2();
	}
	
	
	
	public static void m1()
	{
		System.out.println(i);
		//m2();
	}
	
	public void m2()
	{
		
	}
	
}


