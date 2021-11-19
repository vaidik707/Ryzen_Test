package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class JavaArrayList {

	@Test
	public void collectTest1() {
		
		//Java ArrayList class can contain duplicate elements.

		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("Vaidik");
		alist.add("Hardik");
		alist.add("Amit");
		alist.add("Vaidik");

		for(String list : alist) {
			System.out.println(list);
		}
		
		// Convert List into the Set.
		Set<String> sets = new HashSet<String>(alist);
		System.out.println(sets);

	}
	
	@Test
	public void collectionTest2() {
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(25);
		ilist.add(19);
		ilist.add(16);
		ilist.add(10);
		
		for(int list : ilist) {
			System.out.println(list);
		}
		System.out.println(ilist);
		
	}

}
