package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<Integer> ss= new TreeSet<Integer>();
		ss.add(30);
		ss.add(40);
		ss.add(50);
		ss.add(10);
		ss.add(20);
/*		ss.add(null);
		ss.add(null);*/
		ss.add(10);
		ss.add(20);
		
		
		System.out.println(ss);
		System.out.println(ss.add(1000));
		System.out.println(ss);
		
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.size());
		System.out.println(ss.isEmpty());
		System.out.println(ss.headSet(30));
		System.out.println(ss.tailSet(30));
		System.out.println(ss.subSet(20, 50));
		System.out.println(ss.comparator());
		
		
		
		
		
		
	}
}
