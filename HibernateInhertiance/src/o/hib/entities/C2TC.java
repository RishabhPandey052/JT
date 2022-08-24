package o.hib.entities;

import javax.persistence.Entity;


@Entity
public class C2TC extends Student{
	
	private String  ssTrainerName;
	private String  techTrainerName;
	
	public C2TC() {
		
	}
	
	public C2TC(int uid, String name, String ssTrainerName, String techTrainerName) {
		super(uid, name);
		this.ssTrainerName = ssTrainerName;
		this.techTrainerName = techTrainerName;
	}
	
	public String getSsTrainerName() {
		return ssTrainerName;
	}
	public void setSsTrainerName(String ssTrainerName) {
		this.ssTrainerName = ssTrainerName;
	}
	public String getTechTrainerName() {
		return techTrainerName;
	}
	public void setTechTrainerName(String techTrainerName) {
		this.techTrainerName = techTrainerName;
	}

	@Override
	public String toString() {
		return "C2TC [ssTrainerName=" + ssTrainerName + ", techTrainerName=" + techTrainerName + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
