package practiceQuestions;

public class MoveHash {
	
	public static String moveHashFront(String s,int n) {
		
		String str1 = new String("");
		String str2 = new String("");
		
		for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='#') {
                str1=str1 + s.charAt(i);
            	System.out.println(str1);
            } else
                str2 = str2 + s.charAt(i);
        }		
		return str1.concat(str2);
	}

	public static void main(String[] args) {
		
		String str = "#Move#the#hash#";
		System.out.println(moveHashFront(str,str.length()));

	}

}
