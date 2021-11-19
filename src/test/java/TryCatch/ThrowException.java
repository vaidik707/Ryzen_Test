package TryCatch;

import org.testng.annotations.Test;

public class ThrowException {

	@Test
	public static void show() {
		int a[]= {1,2,3};
		int i=0;

		try {
			for(i=0; i<=a.length; i++) {
				System.out.println(a[i]);
			}
		} 
		catch (Exception e) {
			throw new ArrayIndexOutOfBoundsException("Exception due to: "+i);
		}
		
		System.out.println("Test");

	}

}
