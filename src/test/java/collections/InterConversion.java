package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InterConversion {

	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		HashSet<Integer> h= new HashSet<Integer>(list);
		System.out.println(h);
		
	}

}
