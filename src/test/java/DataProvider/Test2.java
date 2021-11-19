package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(dataProviderClass =  Dataprovider.class, dataProvider = Dataprovider.test2)
	public void DataProvider1(String s1, String s2, String s3) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

//	@DataProvider(name = "testdata")
//	public Object[][] getdata1(){
//		return new String[][] {{"Vaidik", "Soni", "Test"},{"Hardik", "Soni", "Test2"}};
//	}
	
//	@DataProvider(name = "testdata")
//	public Object[][] getdata1(){
//		return new String[][] {{"POS", "LOS"}};
//	}
	
		
}
