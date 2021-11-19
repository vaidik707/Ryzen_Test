package Collection;

import java.util.ArrayList;

import org.testng.annotations.Test;

//Program to search the element.

public class SearchElement {
	
	@Test
	public void search() {
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
		
		if(color.contains("Red")) {
			System.out.println("Found the color");
		}
		else {
			System.out.println("Color not found");
		}
	}
	
	
}
