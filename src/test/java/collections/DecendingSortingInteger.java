package collections;
import java.util.TreeSet;

public class DecendingSortingInteger {

	
	public static void main(String[] args) {
		
	TreeSet<Integer> t= new TreeSet<Integer>(new MyComparator());
	t.add(29);
	for(int i=1;i<=20;i++)
	{
		if(i%2==0)
		{
		t.add(i);
		}
		
	}
	
	t.add(29);
	
	
	
	System.out.println(t);
}
	
}


