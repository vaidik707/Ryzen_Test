package DataProvider;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	public static final String TestData = "getData";
	
	@DataProvider(name = TestData)
	public Object[][] getdata(){
		
		return new String[][] {{"abc", "xyz"}};
		
	}
	
	public static final String test2 = "testdata";
	
	@DataProvider(name = test2)
	public Object[][] getdata1(){
		return new String[][] {{"Vaidik", "Soni", "Test"},{"Hardik", "Soni", "Test2"}};
	}
	
	public static final String test3 = "test3data";
	
	@DataProvider(name = test3)
	public Object[][] getdata3(){
		return new Object[][] {{10,20},{30,40}};
	}

}
