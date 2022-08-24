package o.hib.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "batch18",discriminatorType = DiscriminatorType.STRING)
@Table(name = "details1")
public class Student {

	@Id
	private int uid;
	@Column(name = "Stuname")
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

/*
SINGLE TABLE
all in one with a Discriminator column(name and type can be defined)
for operation on single class's table Discriminator column can be used

TABLE PER CLASS
diff table for each class
contains duplicate values(parent Feilds)

JOINED TABLE
Parent class have all parent feilds of all objects
feilds related to child class is store in their table
have to do join in order to get all data
better , somewhat normalized

*/
