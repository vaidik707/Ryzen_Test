package Collection;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

//Program to join two array lists

public class JoinTwoArrayLists {
	
	@Test
	public void join() {
		
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Blue");
		c1.add("White");
		c1.add("Green");
		c1.add("Black");
		
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Brown");
		c2.add("Pink");
		c2.add("Purpul");
		c2.add("Orange");
		
		ArrayList<String> join = new ArrayList<String>();
		join.addAll(c1);
		join.addAll(c2);
		Collections.sort(join);
		System.out.println(join);
		
	}
}
