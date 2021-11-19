package Array;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int a[]= {5,6,8,6,2};
		int sum = 0;
		
		/*for(int i=0; i<=a.length-1; i++) {
			sum=sum+a[i];
		}*/
		
		
		//Approach 2 - Enhance the loop
		for(int value:a) {
			sum=sum+value;
		}
		
		System.out.println("Sum of array elements: "+sum);

	}

}
