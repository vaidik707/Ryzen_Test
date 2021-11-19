package DataProvider;

import org.testng.annotations.DataProvider;

public class Test {
	@org.testng.annotations.Test(dataProviderClass = Dataprovider.class, dataProvider = Dataprovider.TestData, enabled = true, priority = 1)
	public void test(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
	@org.testng.annotations.Test(priority = 2)
	public void test1() {

	}
	@org.testng.annotations.Test(priority = 1, enabled = false)
	public void test2() {
		
	}
	

}
