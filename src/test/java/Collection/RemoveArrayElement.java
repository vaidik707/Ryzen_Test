package Collection;

import java.util.ArrayList;

import org.testng.annotations.Test;

// Program to remove array element

public class RemoveArrayElement {

	@Test
	public void Remove() {
		//Created a list
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		color.add("Black");

		for(int i=0; i<color.size(); i++) {
			System.out.println(color.get(i));
		}
//		System.out.println(color);

		// Remove third element
		color.remove(2);
		System.out.println("List after removing the element: \n"+ color);
	}

}
