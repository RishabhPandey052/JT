package concurrentClasses;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		Runnable t1 = () ->{
			c.increment(1000);
		};
		
		Runnable t2 = () ->{
			c.increment(1000);
		};
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(c.count);
		
	}

}
