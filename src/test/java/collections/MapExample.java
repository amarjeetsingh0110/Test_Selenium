package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("Amar", 899784211);
		map.put("Waseem",99784211);
		map.put("Smita",99784211);
		
		
		System.out.println(map.get("Smita"));
		System.out.println(map.get("Waseem"));
		System.out.println(map.get("Amar"));
		
		Set<String> allValues=map.keySet();
		for(String s:allValues)
		{
			System.out.println(s +":"+ map.get(s));
		}
		
		
	}

}
