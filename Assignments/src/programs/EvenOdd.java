package programs;
import java.util.Scanner;

public class EvenOdd{
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n & 1)==1){
		    System.out.println("Entered number is odd");
		} else {
		    System.out.println("Entered number is even");
		}
		
		sc.close();
	}
}