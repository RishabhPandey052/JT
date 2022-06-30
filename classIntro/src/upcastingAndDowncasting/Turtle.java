package upcastingAndDowncasting;

public class Turtle extends Animal{
	
	boolean shell;

	Turtle(String name, int age,boolean value) {
		super(name, age);
		this.shell = value;
	
	}
	
	@Override
	void makeNoise() {
		System.out.println("Shhehehshhhsh");
	}
	
	void giveFood() {
		System.out.println("Food given to turtle");
	}

	
	
}
