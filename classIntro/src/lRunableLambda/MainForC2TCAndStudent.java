package lRunableLambda;

public class MainForC2TCAndStudent {
	
	public static void main(String[] args) {
		
		//Make class which extends C2TC and implements Runnable
//		Student s = new Student();
//		Thread t = new Thread(s);
//		t.start();
		
		
		//Using lambda Expression
		C2TC c = new C2TC();
		Runnable t = ()->{
			c.assignment();
		};
		
//		Thread thread = new Thread(t);
//		thread.start();
		
		Thread thread1 = new Thread(()->{
			c.assignment();
		});
		thread1.start();
		
		Thread thread2 = new Thread(()->c.assignment());
		thread2.start();
		
		// Anonymous Object Creation - should be only used once
		new Thread(t).start();
	}
}
;