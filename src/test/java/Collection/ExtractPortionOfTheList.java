package Collection;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

// Extract a portion of a array list

public class ExtractPortionOfTheList {
	
	@Test
	public void Extract() {
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
		
		List<String> sub = color.subList(0, 3);
		System.out.println(sub);
	}

}
