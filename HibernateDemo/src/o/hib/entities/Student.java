package o.hib.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "details")
public class Student {

	@Id
	private int uid;
//	@Column(name = "Stuname")
	private String name;
	
	public Student() {
		
	}

	public Student(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + "]";
	}
}
