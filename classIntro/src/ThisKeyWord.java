
class C1 {
	int a;
	
	/*  //For assigning values to attributes
	C1(int a){
		this.a = a;
		show();
	}
	
	void show() {
		System.out.println(a);
	}
	*/
	
	
	// For calling the default constructor , its call should be in first line of calling method
	C1(){
		System.out.println("Default constructor");
	}
	
	C1(int a){
		this();
	}
	
	void show() {
		System.out.println("Parameterized Constructor"+ a);
		
	}
}

public class ThisKeyWord {
	
	public static void main(String args[]){
		C1 obj = new C1(5);
		obj.show();
		
		
	}

}
