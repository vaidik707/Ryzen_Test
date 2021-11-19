package StringP;

public class VowelandConsonent {
	
	public static void main(String[] args) {
		String name = "Vaidik Soni";
		int vCount = 0;
		int cCount = 0;
		
		name = name.toLowerCase();
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e'|| name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' ) {
				vCount++;
			}
			else if (name.charAt(i)>= 'a' && name.charAt(i)<= 'z') {
				cCount++;
			}
		}
		
		System.out.println(vCount);
		System.out.println(cCount);
		
	}
}
