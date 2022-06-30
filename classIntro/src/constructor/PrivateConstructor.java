package constructor;

class HP{
	int a;
	String s;
	
	static HP whu(){
		
		return new HP();
	}
	
	private HP() {
		this.a = 5;
		this.s ="Five";
	}
	
	public void display() {
		System.out.println(a+" "+s);
	}
}

public class PrivateConstructor {
	public static void main(String args[]) {
		HP obj = HP.whu();
		obj.display();
		
	}

}
