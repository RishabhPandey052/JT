package constructor;

class Single{
	int a;
	String b;
	
	Single(int a, String b){
		this.a = a;
		this.b = b;
	}
	
	Single(Single el){
		this.a = el.a;
		this.b = el.b;
	}
	
	void show() {
		System.out.println(a +" "+b);
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		Single ob1 = new Single(1,"One");
		ob1.show();
		System.out.println("Another object values :");
		Single ob2 = new Single(ob1);
		ob2.show();
		
	}

}
