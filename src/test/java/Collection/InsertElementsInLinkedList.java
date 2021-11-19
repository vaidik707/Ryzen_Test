package Collection;

import java.util.LinkedList;
import org.testng.annotations.Test;

public class InsertElementsInLinkedList {

	@Test
	public void insert() {
		LinkedList<String> color = new LinkedList<String>();
//		List<String> color1 = new LinkedList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		color.add("Black");
	
		for(String colour : color) {
			System.out.println(colour);
		}

		//  element in the list in specific positions.
		color.add(0, "Yellow");
		color.add(2, "Gray");
		
//		color.add("Silver");
//		color.add("Gold");
//		color.addAll(6, color);
		
		System.out.println("New: "+color);
		
		// Insert multiple elements at single index position.
		LinkedList<String> new_color = new LinkedList<String>();
		new_color.add("Silver");
		new_color.add("Gold");
		
		color.addAll(1, new_color);
		System.out.println("New list: "+color);
		
		

	}
}
