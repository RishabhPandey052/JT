package programs;
import java.util.Scanner;

public class CheckAnagram {
	
	static boolean checkAnagram(char[] s1,char[] s2) {
		
		int[] count = new int[256];
				
		if(s1.length != s2.length) return false;
		
		for(int i =0;i<s1.length;i++) {
			
			count[s1[i]]++;
			count[s2[i]]--;
		}
		
		for(int i=0;i<256;i++) {
			
			if(count[i] != 0) return false;
		}
		return true;	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(checkAnagram(s1.toCharArray(),s2.toCharArray())) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		sc.close();
	}
}