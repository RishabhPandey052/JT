package classIntro;

public class HouseDetail {
	String housename;
	int doorNum;
	String street;
	
	HouseDetail(String houseName,int doorNum,String street){
		this.doorNum = doorNum;
		this.housename = houseName;
		this.street = street;
	}
	
	public HouseDetail display() {
		System.out.println(this.housename + " My house");
		return this;
	}
	
	public HouseDetail detail() {
		System.out.println(this.doorNum + " This is doornum");	
		System.out.println(this.street + " Street name");		
		return this;


	}

}
