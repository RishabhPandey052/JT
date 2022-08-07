package lMutlithreading;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
//	Exception in one thread doesnt interupt exceution of other
		MyThread thread1 = new MyThread();
		
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		thread1.start();
		//thread1.join(3000);
		thread2.start();
		
		
		
		
		 
	}

}
