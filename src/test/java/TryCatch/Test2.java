package TryCatch;

import java.io.IOException;

public class Test2 extends Test1 {
		
	public void show1() {
		int num = 100/0;
	}
	
	public void show2() throws ArrayIndexOutOfBoundsException{
		int a[]= {1,2,3};
		for(int i=0; i<=3; i++) {
			System.out.println(a[i]);
		}
		System.out.println("I am in show2 of Test1");
	}
}
