package o.hib.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@SuppressWarnings("unused")
@Entity
@Table(name = "Map3Student")
public class Student {

	@Id
	private int uid;
//	@Column(name = "Stuname")
	private String name;
	
//  R1
//	@OneToOne
//	private Laptop laptop;
	
	
//	 R22
//	@OneToMany(mappedBy = "student")
//	private List<Laptop> laptop = new ArrayList<>();
	
//   R3
	@ManyToMany(mappedBy = "students")
	private List<Laptop> laptop = new ArrayList<>();
	

	
	
	
	public Student() {}

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
		return "Student [uid=" + uid + ", name=" + name + ", laptop=" + laptop + "]";
	}

	
//	R1 -- Start
	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
// R1 -- END	

//	R21,22,3 -- Start
	
	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

//	R21,22,3 -- End
	
	
}



/*
    student    Laptop
R1  OneToOne	empty    [Map1]
R21 OneToMany   empty    [Map21] -- creates 3 table
R22 OneToMany   ManyToOne [Map22] -- creates only 2 table, because mapped by in student Class if not then 3 table --> student_uid (col in laptop)
R3  ManyToMany  ManyToMany [Map3]  
		-- if mapped not used 4 tables as both classes will map 
		-- if mapped used then 3 tables  mapping in seperate table

*/

/* toString not prefect*/