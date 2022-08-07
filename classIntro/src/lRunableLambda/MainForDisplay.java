package lRunableLambda;

public class MainForDisplay {
	
	public static void main(String[] args) {
		
		//Anonymous Inner Class
		Display d = new Display() {
			
			@Override
			public void show() {
				System.out.println("Show from Anonymous Inner Class");
			}
			
		};
		d.show();
		
		//Lambda Expression 
		Display d1 = () ->{
			System.out.println("Show from Lambda Expression");
		};
		d1.show();
	}
}
