package AutomationPackeg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {
	
	//What is the difference b/w BeforeTest and BeforeMethod
	
	@Test
	public void TestCase1() {
		System.out.println("In TestCase 1");
	}
	@Test
	public void TestCase2() {
		System.out.println("In TestCase 2");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("In Before Test");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("In After Test");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("In Before Method");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("In After Method");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("In Before Class");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("In After Class");
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("In Before Suite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("In After Suite");
	}

}
