package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class HashMapTest01 {
	
	@Test
	public void testHashMap() {
		
		NavigableMap<String, String> hash_map = new TreeMap<String, String>();
		hash_map.put("Name", "Vaidik");
		hash_map.put("Id", "001");
		hash_map.put("City", "Indore");
		hash_map.put("Country", "India");
		
		System.out.println(hash_map.descendingMap());
		System.out.println(hash_map.headMap("Id", true));
		
		
		
		// It will print all the keys of the hashmap.
		Set<String> set = hash_map.keySet();
		System.out.println(set);
		
//		
//		// Convert HashMap into ArrayList
//		List<String> AL	= new ArrayList<String>(set);
//		System.out.println(hash_map.get("Name"));
//		
//		// To iterate both keys and values
		for(Map.Entry m : hash_map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		
		
	}

}
