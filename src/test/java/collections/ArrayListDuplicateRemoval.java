package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayListDuplicateRemoval {
	
//	static ArrayList<Integer> list;
	
	public static void main(String[] args) {
		
		ArrayListDuplicateRemoval ref= new ArrayListDuplicateRemoval();
		ref.arrayList();
	}

	
	
	public void arrayList()
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,4,2,44,2,33,5,44,5,66,87,3,4,5,100,200,100,201,340));
		System.out.println("List with Duplicate Elements : "+ list);
		
		//Removing Duplicate ArrayList Element with the help of HashSet
		ArrayList<Integer> newList1=removeDuplicatesWithHashSet(list);
		System.out.println("Array List with Unique elements by using HashSet(Sorting Order not Maintained)  : \t" +newList1);
		
		ArrayList<Integer> newList2=removeDuplicatesWithLinkedHashSet(list);
		System.out.println("Array List with Unique elements by using LinkedHashSet(Sorting Order not Maintained)  : " +newList2);
		
		ArrayList<Integer> newList3=removeDuplicatesWithTreeSet(list);
		System.out.println("Array List with Unique elements by using TreeSet(Sorting Order Maintained)  : \t\t" +newList3);

		ArrayList<Integer> newList4=removeDuplicateWithAnotherArrayList(list);
		System.out.println("Array List with Unique elements by using ArrayList(Sorting Order not Maintained)  : \t" +newList4);
		
		
		
		//List<Integer> newList = list.stream().distinct().collect(Collectors.toList()); 
		//ArrayList<Integer> newList4=new ArrayList<Integer>();
		
	}
	
	
	public ArrayList<Integer> removeDuplicatesWithHashSet(ArrayList<Integer> list1)
	{
		HashSet<Integer> h = new HashSet<Integer>(list1);
		ArrayList<Integer> list2= new ArrayList<Integer>(h); 
		return list2;
	}
	
	
	public ArrayList<Integer> removeDuplicatesWithLinkedHashSet(ArrayList<Integer> list1)
	{
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>(list1);
		ArrayList<Integer> list2= new ArrayList<Integer>(h);
		return list2;
	}
	
	public ArrayList<Integer> removeDuplicatesWithTreeSet(ArrayList<Integer> list)
	{
		TreeSet<Integer> t= new TreeSet<Integer>(list);
		ArrayList<Integer> list2= new ArrayList<Integer>(t);
		return list2;
	}
	
	
	public ArrayList<Integer> removeDuplicateWithAnotherArrayList(ArrayList<Integer> list)
	{
		ArrayList<Integer> newList= new ArrayList<Integer>();
		
		for(Integer element:list)
		{
			if(!newList.contains(element))
			{
				newList.add(element);
			}
		}
		
		return newList;
	}

}
