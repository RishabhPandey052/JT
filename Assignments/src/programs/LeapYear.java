package programs;
import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args) {
	    
 	    Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
        
		boolean flag = false;
		
		if(n%4 == 0){
		    if(n%100 ==0){
		        if(n % 400 == 0)  flag = true;
		        else flag = false;
		     }else flag = true;
		    
		}else flag = false;
		
		if(flag){
		    System.out.println("Entered year is Leap year");
		} else {
		    System.out.println("Entered year is not a leap year");
		}
		sc.close();
	}
}