package TryCatch;

import java.io.IOException;

public class ThrowsException  {
	
		//It will throws only predefined exceptions.
	
		public static void main(String[] args) throws IOException  {
			Exception1();
		}

		public static void Exception1() throws IOException {
		int a[] = {1,2,3};

		for(int i=0; i<=3; i++) {
			System.out.println(a[i]);
		} 
		
		System.out.println("Test");
		
	}
}