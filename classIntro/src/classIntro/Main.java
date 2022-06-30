package classIntro;

public class Main {
	
	static int a = 10;
	
	public static void main(String[] args) {
		
		HouseDetail building = new HouseDetail("DEDF", 24, "ABC");
		building.display().detail();
		a= 30;
		System.out.println(a + " A in main ");

	}
	
	static {
		System.out.println("First in static ");
		a = 20;
		System.out.println(a);
		
		
	}

}
