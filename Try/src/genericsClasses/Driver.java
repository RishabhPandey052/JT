package genericsClasses;

public class Driver {
	
	public static void main(String[] args) {
		
		HoldAndPrints in = new HoldAndPrints<>();
		in.setHolder(8);
		in.prints();
		
		in.setHolder(5f);
		in.prints();
		
		in.setHolder("ABC");
		in.prints();
	}
}
