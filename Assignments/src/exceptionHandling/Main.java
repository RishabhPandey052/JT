package exceptionHandling;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int p= s.nextInt();
		
		
		Calculator calc = new Calculator();
		
		try {
			long ans = calc.calcPower(n, p);
			System.out.println(ans);
		}
	    catch(Exception e) {
	    	System.out.println(e);
	    }
		
		
		
		
		
		
		s.close();
	}

}
