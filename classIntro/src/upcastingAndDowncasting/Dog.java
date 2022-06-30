package upcastingAndDowncasting;

public class Dog  extends Animal{
	
	int height;

	Dog(String name, int age,int height) {
		super(name,age);
		this.height = height;
	}
	
	@Override
	void makeNoise(){
		System.out.println("Woof Woff !!");
	}
	
	void takeToWalk() {
		System.out.println("Took dog for a walk");
	}
}
