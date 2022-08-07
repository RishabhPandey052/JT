package lString;


public class RemoveCharacters {
	
	public static String removeCh(String s,char a) {
		
		char temp [] = new char[s.length()];
		int curr = 0;
		
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == a) {
				continue;
			}
			temp[curr++] = s.charAt(i);
			temp[curr] = '\0';
		}
		
		
		return String.valueOf(temp);	
		}
	
	public static void main(String[] args) {
		String str = "abadaf";
		System.out.println(str);
		str = removeCh(str,'a');
		System.out.println(str);
	}
}
