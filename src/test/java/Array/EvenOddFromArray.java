package Array;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		// Extracting even number
		System.out.println("Even numbers are: ");
		/*for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" ");
			}
		}*/
		
		// Enhance the loop
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value+" ");
			}
		}	
		
		// Extracting odd number
		System.out.println("Odd numbers are: ");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]+" ");
			}
		}

	}

}
