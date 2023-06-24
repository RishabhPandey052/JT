package genericsClasses;

public class HoldAndPrints<T> {
	
	T holder;
	
	public void setHolder(T value) {
		this.holder = value;
	}
	
	public void prints() {
		System.out.println(holder);
	}

}
