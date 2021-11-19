package Collection;

import java.util.ArrayList;
import org.testng.annotations.Test;

public class CompareTwoArrayLists {
	
	@Test
	public void compare() {

		//Created a list
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Blue");
		c1.add("White");
		c1.add("Green");
		c1.add("Black");
		
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Red");
		c2.add("Blue");
		c2.add("Green");
		c2.add("Black");
		c2.addAll(c1);
		
		
		ArrayList<String> c3 = new ArrayList<String>();
		for(String C : c1) 
			c3.add(c2.contains(C) ? "Yes":"No");
			System.out.println(c3);
		
		
			
	}

}
