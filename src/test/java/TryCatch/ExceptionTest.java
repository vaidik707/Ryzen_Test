	package TryCatch;
	
	import org.testng.annotations.Test;
	
	public class ExceptionTest {
		@Test
		public static void Exception() {
			int a[] = {1,2,3};
	
			try {
				for(int i=0; i<=3; i++) {
					System.out.println(a[i]);
				}
			} 
			
			//Child catch
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}
			
			// Parent catch
			 catch (Exception e) {
				System.out.println(e.toString());
			}
			finally {
				System.out.println("I am in finally");
			}
	
		System.out.println("Test");
	
	}
	
	}
