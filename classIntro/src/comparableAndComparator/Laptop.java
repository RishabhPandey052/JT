package comparableAndComparator;

public class Laptop implements Comparable<Laptop>{
	
	private String brandName;
	private int ram;
	private int price;
	
	
	public Laptop(String brandName, int ram, int price) {
		super();
		this.brandName = brandName;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", ram=" + ram + ", price=" + price + "]\n";
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public int getRam() {
		return ram;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Laptop lap2) {
		
		/*
		 this > lap2  +
		 this < lap2  -
		 this = lap2  0  
		 */
		
		if(this.getRam() > lap2.getRam())
			return 1;
		else if(this.getRam() < lap2.getRam())
			return -1;
		else 
			return 0;
	}
	
}
