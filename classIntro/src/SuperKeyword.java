
class A {
	int a = 10;
	
	void show() {
		System.out.println("Value of A in parent class " + a);
	}
}

class B extends A {
	int a = 20;
	
	void show(){
		
		super.show();
		System.out.println("Value of A in child class "+ a);
	}
}
public class SuperKeyword {
	

	public static void main(String args[]) {
		B obj  = new B();
		obj.show();		
		
		
	}
}
