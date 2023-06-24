package practiceQuestions;

public class CompressString {
	
	public static String stringCompressor(String s,int n) {
	
		String str = new String("");
		int count = 1;
		for(int i=0;i<n;i++) {
			
			if(((i+1) < n) && s.charAt(i) == s.charAt(i+1)) {
				++count;
			} else {
				if(count ==0 || count == 1) {
					str = str + s.charAt(i);
				} else {
					str = str + s.charAt(i) + count;
				}
				count = 1;
			}
		}
		
		
		
		return str;
	}

	public static void main(String[] args) {
		
		String s = "abbccccc";
		System.out.println(stringCompressor(s,s.length()));
			
	
	}

}
