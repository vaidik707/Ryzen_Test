package StringP;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTest {
//	@Test
//	public void show() {
//		String name = "Vaidik";
//		String surname = "Soni";
//		String ss = new String("RMS");
//		System.out.println(ss);
//		
//		//compareTo method compares first string with second and returns integer value.
//		System.out.println(surname.compareTo(name));
//		name=name.concat(" Ashok");
//		System.out.println(name.concat(" "+surname));
//	}
//	
//	//SubString Method------------------------------------------!
//	@Test
//	public void SubStringTest() {
//		String a = "Automation";
//		System.out.println(a.substring(4));
//		System.out.println(a.substring(0,4));
//	}
//	
//	//Split Method
//	@Test
//	public void SplitTest() {	
//		String [] n = "Vaidik_Samkit_Prateek".split("_");
//		System.out.println(n[0]);
//		System.out.println(n[1]);
//		System.out.println(n[2]);
//	}
	
	//Reverse String without third variable.
	@Test
	public void Reverse() {
		String ss = "Vaidik";
		StringBuffer name = new StringBuffer(ss);
		String rev = name.reverse().toString();
		System.out.println(rev);
//		Assert.assertEquals("kidiaV", rev.toString());
		Assert.assertTrue(rev.equalsIgnoreCase("kidiav"), "String Reversed: kidiaV");
		

		
	}

}











