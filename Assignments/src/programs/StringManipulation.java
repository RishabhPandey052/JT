package programs;
import java.util.Scanner;

public class StringManipulation {
	
	static boolean compareLexi(String s1,String s2){
		
        	if((s1.compareTo(s2))<0)  return false;
   		return true;
    	}

	static String convertFirstLetter(String s){

        	if(s == null) return s;        
        	return s.substring(0,1).toUpperCase()+s.substring(1);
    	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine(); 
		String s2 = sc.nextLine(); 
		
		System.out.println(s1.length()+s2.length());
		
		if(compareLexi(s1,s2) == false) System.out.println("no");
	    	else System.out.println("yes");
		
		System.out.println(convertFirstLetter(s1) +" "+convertFirstLetter(s2));
		 
		sc.close();
	}
}