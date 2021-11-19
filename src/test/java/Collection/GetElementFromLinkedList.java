package Collection;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class GetElementFromLinkedList {
		
	@Test
	public void getElement() {
		LinkedList<String> color = new LinkedList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		color.add("Black");
		
		Object obj = color.getFirst();
		System.out.println("First element: "+obj);
		
		Object obj1 = color.getLast();
		System.out.println("Last element: "+obj1);
		
		System.out.println("Element of third index position: "+color.get(3));
	}
}
