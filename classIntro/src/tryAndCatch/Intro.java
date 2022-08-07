package tryAndCatch;

public class Intro {

	public static void main(String[] args) {
		
		int a = 0;
		try {
			 a = Integer.parseInt("18");
		} catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(a);
		

		System.out.println(printNumber());
		
	}
	
	@SuppressWarnings("finally")
	public static int printNumber() {
		
		try {
			return 3;			
		} catch (Exception e) {
			return 4;
		} finally {  // finally which override return statement of try
			return 5;
		}
	}
}
