package Collection;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

// Program to add element in the list in different positions and get element from the lisr

public class InsertElementIntoArrayList {

	@Test
	public void insert() {

		//Created a list
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		color.add("Black");
	
		for(String colour : color) {
			System.out.println(colour);
		}

		//Insert element in the list
		color.add(0, "Yellow");
		color.add(2, "Gray");
		System.out.println(color);


		// Get Element from the list.
		String col = color.get(6);
		System.out.println(col);
		
		// Sort the elements
		Collections.sort(color);
		System.out.println("Sorted List: "+color);
		
		// Shuffle the elements of list.
		Collections.shuffle(color);
		System.out.println("Shuffled list: "+color);
		
		// Reverse the elements of the list
		Collections.reverse(color);
		System.out.println("Reverse list: "+ color);
	

	}

}
