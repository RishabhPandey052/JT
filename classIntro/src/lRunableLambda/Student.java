package lRunableLambda;

public class Student extends C2TC implements Runnable{

	@Override
	public void run() {
		System.out.println("From student runnable then parent class");
		assignment();
		
	}
	
}
