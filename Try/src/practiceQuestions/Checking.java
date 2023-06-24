package practiceQuestions;

public class Checking {
	
	public static void main(String[] args) {
		String str = "move the hash";
		String boiler = "#";
		
		String result = str.concat(boiler);
		System.out.println(str.concat(boiler));
		str = str + "a";
		System.out.println(str);
		System.out.println(result);
	}
}
