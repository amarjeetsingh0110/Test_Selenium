package collections;

import java.util.Comparator;

public class ComparableComparator implements Comparator{
	public static void main(String[] args) {
		
		
		String a="AMAR";
		String b="amar";
		String c="AMAR";
		
		Integer d= new Integer(110);
		Integer e= new Integer(1);
		
		System.out.println(new Integer(d).compareTo(e));
		System.out.println(c.compareTo(b));
		
	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}


