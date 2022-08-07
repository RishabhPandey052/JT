package lString;

public class ReplaceCharacters {
	
	public static String replaceCh(String s, char a,char b) {
		
		char temp[] = s.toCharArray();
		for(int i = 0;i<temp.length;i++) {
			if(temp[i] == a) {
				temp[i]= b;
			}
		}
		return String.valueOf(temp);
		
		
	}
	public static void main(String[] args) {
		String str = "aabbccaa";
		str = replaceCh(str,'a','z');
		System.out.println(str);
	}

}
