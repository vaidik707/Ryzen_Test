package Collection;

import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetTest {

	@Test
	public void testTreeSet() {

		Set<String> color = new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Green");
		color.add("Black");

		System.out.println("Ascending Order: "+color);

		TreeSet<String> it = (TreeSet<String>) ((TreeSet<String>) color).descendingSet();

		System.out.println(it);
	}

}
