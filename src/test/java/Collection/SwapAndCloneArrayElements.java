package Collection;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

// Program to swap and clone array list

public class SwapAndCloneArrayElements {

	@Test
	public void swap() {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		color.add("Black");
		
		int count_Red=0;
		int count_Blue=0;
		
		for(int i=0; i<color.size();i++) {
			if(color.get(i).equals("Red")) {
				count_Red=i;
			}
			if(color.get(i).equals("Blue")) {
				count_Blue=i;
			}
		}
		System.out.println(count_Red);
		System.out.println(count_Blue);

		System.out.println("List Before Swap: "+color);
		
		color.add(count_Red, "Blue");
		color.add(count_Blue, "Red");

		Collections.swap(color, count_Red, count_Blue);
		System.out.println("List After Swap: "+color);
		
//		ArrayList<String> clon_List = (ArrayList<String>)color.clone();
//		System.out.println("Cloned list: "+clon_List);

	}

}
