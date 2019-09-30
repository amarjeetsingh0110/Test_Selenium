package rough;

import java.util.Scanner;

public class Excercise {
	static double dd=4.5;
	//int count=0;
	public static void main(String[] args) {
		new Excercise().calculation(dd);
	}
	public void calculation(double b)
	{
		
		int input=(int)b+5;
		System.out.println("Printing Table of ====>> " +input );
		for(int i=1;i<=10;i++)
		{
			System.out.println(input+"*"+i +"==>"+input*i);
		}
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Do you want to continue :Y/N ");
		String userInput= scan.nextLine();
		
		if(userInput.equalsIgnoreCase("y"))
		{
			dd=dd+2;
			calculation(dd);
		}
		else
		{
			System.out.println("Thanks for Using Program");
		}
		//count =count +1;
		
		
	}
}
