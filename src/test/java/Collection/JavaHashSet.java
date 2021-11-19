package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class JavaHashSet {
	
	@Test
	public void collectionTest5() {
		
		//HashSet contains unique elements only
		
		HashSet<String> set = new HashSet<String>();
		set.add("Vaidik");
		set.add("Soni");
		set.add("Hardik");
		set.add("Soni");
		
//		for(String hasT : set) {
//			System.out.println(hasT);
//		}
		
		List<String> lists = new ArrayList<String>(set);
		System.out.println(lists);
		
		System.out.println(set.size());
		
		Set<String> tree = new TreeSet<String>(set);
		System.out.println(tree);
	}

}
