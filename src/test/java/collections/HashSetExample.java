package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> lh= new LinkedHashSet<Integer>(10);
		lh.add(null);
		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(40);
		lh.add(null);
		lh.add(10);
		lh.add(20);
		lh.add(50);
		
		System.out.println(lh);
		
		
		
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(10);
		ar.add(20);
		ar.add(null);
		ar.add(null);
		
		HashSet<Integer> h = new HashSet<Integer>(ar);
		
		System.out.println(h);
		System.out.println(h.add(10));
		System.out.println(h.add(100));
		System.out.println(h);
		
		System.out.println(ar);
		
		
		
	}

}

