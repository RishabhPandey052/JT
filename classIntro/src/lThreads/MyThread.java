package lThreads;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		if(this.isDaemon()) {
			System.out.println("Daemon thread is running");
		} else {
			System.out.println("Normal thread is running");
		}
	}
}
