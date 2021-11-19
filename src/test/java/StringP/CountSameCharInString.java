package StringP;

public class CountSameCharInString {
	
	public static void main(String[] args) {
		
		String ss= "abbcccddda";
		int Count = 1;
		
		for(int i=0; i<ss.length()-1; i++) {
			char temp = ss.charAt(i);
			
//			System.out.println(temp);
			
			if(temp==ss.charAt(i+1)){
				Count = Count+1;
					
			}
					
		}
	
	}

}
