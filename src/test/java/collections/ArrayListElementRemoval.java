package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListElementRemoval {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<=20;i=i+2)
		{
			list.add(i);
		}
		
		System.out.println("Whole ArrayList : "+list);


		//Element Removal by using Index Number (Removing first and last Index)
		list.remove(0);
		list.remove(list.size()-1);
		System.out.println("New ArrayList after removal first and last Index : "+list);
		
		
		//Element Removal by using Object
		list.remove(new Integer(10));
		System.out.println("New ArrayList after removal of object: "+list);
		
		
		//Element Removal by using Iterator
		Iterator<Integer> lt= list.iterator();
		while(lt.hasNext())
		{
			if(lt.next()==12)
			{
				lt.remove();
			}
		}
		System.out.println("New ArrayList after removal of object by using Iterator: "+list);
		
		
		//Element Removal by using ListIterator
		ListIterator<Integer> ltr= list.listIterator();
		while(ltr.hasNext())
			while(ltr.hasNext())
			{
				if(ltr.next()==18)
				{
					ltr.remove();
				}
			}
			System.out.println("New ArrayList after removal of object by using ListIterator: "+list);
		
		
		
	}
	
	

}
