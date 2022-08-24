package o.hib.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "Map3Laptop")
public class Laptop {
	
	@Id
	private int lId;
	private String lName;
	
//	R1
//	nothing
	
//	R21
//	nothing
	
//	R22
//	@ManyToOne
//	private Student student;
	
//  R3
	@ManyToMany
	private List<Student> students = new ArrayList<>();
 	
	
	
	
	
	public Laptop() {}
	
	public Laptop(int lId, String lName) {
		super();
		this.lId = lId;
		this.lName = lName;
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	
	
	
//	R22 -- Start
	
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	
//	R22 -- End
	
	
//	R3 -- Start
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
//	R3 -- End
	
	

}
