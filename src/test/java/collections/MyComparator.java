package collections;

import java.util.Comparator;

public class MyComparator implements Comparator{
	
	
	public int compare(Object o1, Object o2)
	{
		
		//For String Objects
		String s1= (String)o1;
		String s2= (String)o2;

		//Ascending Order
		//return s1.compareTo(s2);

		//Descending Order
		return -s1.compareTo(s2);
		
		//Insertion Order
		//return 1;
		
	}
}
		
		
		
/*		//For Integer Objects
		Integer i1= (Integer)o1;
		Integer i2= (Integer)o2;
		
		
		//Ascending order
		//return i1.compareTo(i2);
		//return -i2.compareTo(i1);
		
		//Descending order
		//return -i1.compareTo(i2);
		//return i2.compareTo(i1);
		
		//Insertion Order
		//return +10000;
		
		//Reverse of Insertion Order
		return -1;
		
		//return 0;
		*/
		
		/*if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
			return -2;
		}
		
		else
		{
		return 0;
		}*/
