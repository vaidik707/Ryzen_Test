package TryCatch;

import java.io.IOException;

public class Test1 {
	
	public void show1() throws IOException {
		int num = 100/0;
		
	}
	
	public void show2() {
		int a[]= {1,2,3};
		for(int i=0; i<=3; i++) {
			System.out.println(a[i]);
		}
		System.out.println("I am in show2 of Test2");
	}

}
