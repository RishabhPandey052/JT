package upcastingAndDowncasting;

public class Main {

	public static void main(String[] args) {
		
		Animal d = new Dog("Dogesh",5,4);
		//d.makeNoise();
		Animal t = new Turtle("Tutle",3,true);
		//t.makeNoise();
		
		doAnimalStuff(d); // upcasting as dog object will be casted into animal object
		doAnimalStuff(t); // upcasting as turtle object will be casted into animal object
	}
	
	public static void doAnimalStuff(Animal ani) {
		ani.makeNoise();
		
		if(ani instanceof Dog) {
			Dog d	= (Dog) ani;
			d.takeToWalk();
		}
		
		if(ani instanceof Turtle) {
			Turtle t = (Turtle) ani;
			t.giveFood();
		}
	}

}
