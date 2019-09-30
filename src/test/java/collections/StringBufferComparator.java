package collections;

import java.util.TreeSet;

public class StringBufferComparator {

	
	public static void main(String[] args) {
		
		TreeSet<StringBuffer> t= new TreeSet<StringBuffer>(new MyComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("R"));
		t.add(new StringBuffer("J"));
		t.add(new StringBuffer("E"));
		t.add(new StringBuffer("E"));
		t.add(new StringBuffer("T"));
		
		
		System.out.println(t);
	}
}