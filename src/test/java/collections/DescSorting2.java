package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class DescSorting2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> t= new TreeSet<Integer>();
		for(int i=0;i<=20;i=i+2)
		{
			t.add(i);
		}
		System.out.println(t);
		
		
	  Set<Integer> sorted = new TreeSet<Integer>(new Comparator<Integer>() {
          public int compare(Integer o1, Integer o2) {
          return o2.compareTo(o1);
	            }
	        });
		
		
	}
	
	
	
	
}
