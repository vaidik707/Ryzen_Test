package DataProvider;

import org.testng.annotations.Test;

public class Test3 {
	@Test(dataProviderClass = Dataprovider.class, dataProvider = Dataprovider.test3)
	public void Provider(int a, int b) {
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(a+b);
		
	}

}
