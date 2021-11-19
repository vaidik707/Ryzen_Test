package AutomationPackeg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	//Hard Assert
	@Test
	public void AssertionTest() {
		Assert.assertTrue(true, "Condition passed");
		Assert.assertTrue(false, "Condition Failed");
		System.out.println("Next assert will run");
		Assert.assertTrue(true, "Condition passed");
	}
	
	//Soft Assert
	//The disadvantage of SoftAssert is when we use same object in two test then if first will fails then second also fails
	
	SoftAssert SoftA = new SoftAssert();
	
	@Test
	public void SoftAssertTest() {
		
		SoftA.assertTrue(true, "Condtion Passed");
		SoftA.assertTrue(false, "Condtion Failed");
		System.out.println("Next soft assert will run");
		SoftA.assertTrue(true, "Condtion Passed");
		SoftA.assertAll();
	}
	
	public void SoftAssert2() {
		
		System.out.println("The disadvantage of Soft Assert");
		SoftA.assertEquals("Welcome", "Welcome");
		SoftA.assertAll();
	}

}
