package Collection;

import java.util.ArrayList;

import org.testng.annotations.Test;

//Update specific array element with new element

public class UpdateArrayElement {
	
	@Test
	public void Update() {

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
		System.out.println(color);
		
		// Update the first element with Pink
		color.set(0, "Pink");
		System.out.println(color);
		
	}

}
