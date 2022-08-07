package hashCode;

import java.util.Objects;

public class Students implements Comparable<Students>{
	
	private int UID;
	private String name;
	
	public Students(int Uid,String name) {
		this.UID = Uid;
		this.name = name;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Students [UID=" + UID + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(UID, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return UID == other.UID && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Students o) {
		
		if(this.getUID() >= o.getUID())
			return 1;
		else 
			return -1;
	}
	
	
		
	
	

}
