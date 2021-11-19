package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.MultiValueMap;
import org.testng.annotations.Test;

import com.google.common.collect.Multimap;

public class HashMap_Book {
	@Test
	public void book() {


		Map<Integer, List<String>> book = new HashMap<Integer, List<String>>();

		List<String> book1 = new ArrayList<String>();
		book1.add("The Monk");
		book1.add("Robin");

		List<String> book2 = new ArrayList<String>();
		book2.add("Life of a Monk");
		book2.add("Jay");

		List<String> book3 = new ArrayList<String>();
		book3.add("Ikkigai");
		book3.add("Japan");

		book.put(01, book1);
		book.put(02, book2);
		book.put(03, book3);

//		System.out.println(book);

		for(Map.Entry m : book.entrySet()) {
			System.out.println("Key = "+m.getKey()+" , "+"Value = "+m.getValue());
		}
		
		List<String> value = book.get(01);
		System.out.println(value);
	}
	
	

}
