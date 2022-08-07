package lThreads;

public class ThreadMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		//No of active thread
		//System.out.println(Thread.activeCount());
		
		//For Name of current thread
		//System.out.println(Thread.currentThread().getName());
		
		//For setting name of thread
		//Thread.currentThread().setName("MainThread");
		//System.out.println(Thread.currentThread().getName());
		
		
		//For getting priority (1 to 10)
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(9);
		//System.out.println(Thread.currentThread().getPriority());
		
		// For checking it is alive or not
		//System.out.println(Thread.currentThread().isAlive());
		
		
		
		//Thread Slave
		
//		for(int i = 3; i > 0; i--){
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		
		//Daemon thread perform garbage collection,runs in background
		// JVM terminates itself when all user threads are finished
				
		MyThread thread2 = new MyThread();
		
		
		//thread2.setDaemon(true);
		// ^^ should be set true before starting the thread
		
		thread2.start();
		//System.out.println(thread2.isAlive());
		
		//System.out.println(thread2.getName());
		
		//if thread gets created by another thread 
		// inherits the priority of thread which created it 
		//System.out.println(thread2.getPriority());
		
		 
		
		
		
		System.out.println(thread2.isDaemon());
		
		
	}

}
