package collections;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(10);
		
		System.out.println(t);
	}
	

}
