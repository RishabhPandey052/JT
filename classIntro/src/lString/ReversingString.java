package lString;

public class ReversingString {
	
	public static String reverseString(String s) {
		
		char temp[] = s.toCharArray();
		
		int i = 0 ,j = temp.length-1;
		
		while(i < j) {
			
			char tempchar = temp[i];
			temp[i] = temp[j];
			temp[j] = tempchar;
			
			i++; j--;
		}
		
		return String.valueOf(temp);
	}
	
	public static void main(String[] args) {
		
		String str = "abcdef";
		System.out.println(str);
		str = reverseString(str);
		System.out.println(str);
		
		
	}
}
