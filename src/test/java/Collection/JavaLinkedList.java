package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class JavaLinkedList {

	@Test
	public static void collectionTest3() {
		
		//Java LinkedList class can contain duplicate elements.
		//Iterate through all elements in a linked list starting at the specified position
		

		LinkedList<String> link = new LinkedList<String>();

		link.add("Vaidik");
		link.add("Soni");
		link.add("Hardik");
		link.add("Soni");
		
		Iterator<String> p = link.listIterator(2);

		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		// Reverse the list.
		Collections.reverse(link);
		System.out.println(link);
	}

	@Test
	public static void collectionTest4() {

		LinkedList<Integer> link = new LinkedList<Integer>();
		
		link.add(10);
		link.add(20);
		link.add(30);
		link.add(10);
	
		for(int list : link) {
			System.out.println(list);
		}
		System.out.println(link);
		
		// Reverse the list.
		Iterator it = link.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
