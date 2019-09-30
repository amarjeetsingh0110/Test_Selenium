package collections;

import java.util.TreeSet;

public class ComparatorExample {
	
	public static void main(String[] args) 
	{
	TreeSet<String> t = new TreeSet<String>(new MyComparator());
			t.add("Amar");
			t.add("Jeet");
			t.add("Singh");
			t.add("Flora");
			
			System.out.println(t);
	}

}
