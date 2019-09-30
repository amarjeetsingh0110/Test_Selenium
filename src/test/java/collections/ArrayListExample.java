package collections;

import java.util.ArrayList;

public class ArrayListExample {

	
	public static void main(String[] args) {
		
		byte b=126;
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Amar");
		list.add(null);
		list.add("Amar");
		list.add(1, "Amarjeet Singh");
		
		System.out.println(list);
		System.out.println("Size of the list is  :" +list.size());
		System.out.println("2nd Index value of the list is :" +list.get(2));
		
		if(list.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is not Empty");
			
		}
		
		System.out.println("Adding 2nd new Object to the list at the last end :" +list.add("Rahul"));
		System.out.println("Printing new list :" +list);
		
		System.out.println("Printing last object of the list :" +list.get(list.size()-1));
		
		System.out.println("****************************************");
		System.out.println("<<==========:PRINTING LIST:==========>>");
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i));
		}
		
		System.out.println("****************************************");
		
		
		for(String a:list)
		{
			System.out.println(a);
			
		}
		
			
			
		
		
	}
}
