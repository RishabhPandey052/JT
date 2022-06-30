interface vehical{
	String Name = "TVS";
	int Speed = 100;
	
	void start();
	void stop();
}

class Customer implements vehical{

	@Override
	public void start() {
		System.out.println("Started");		
	}

	@Override
	public void stop() {
		System.out.println("Stoping");		
	}
	
}
public class InterfaceEx {
	
	public static void main(String args[]) {
	Customer obj = new Customer();
	obj.start(); obj.stop();
	System.out.println(vehical.Speed);
	}
}
