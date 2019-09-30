package collections;

import java.util.TreeSet;

public class StringComparator {
	
	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<String>(new MyComparator());
		
		t.add("Amar");
		t.add("Jeet");
		t.add("Singh");
		t.add("Pankaj");
		t.add("Anshu");
		t.add("Smita");
		t.add("Smitar");
		t.add("Patnaik");
		
		System.out.println(t);
		
	}

}

