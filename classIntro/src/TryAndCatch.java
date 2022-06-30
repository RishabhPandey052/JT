
public class TryAndCatch {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		
		int a = 10,b=0,c;
		
		try {
			c = a/b;
			System.out.println(c);
		} catch(Exception e){
			System.out.println(e);
			
		}
		System.out.println("End");
		
		
	}

}
