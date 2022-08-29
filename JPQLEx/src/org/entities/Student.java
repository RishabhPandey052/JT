package org.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "StuJPQL")
@NamedQueries(@NamedQuery(name = "getallStudent",query = "SELECT s FROM Student s"))
public class Student {
	@Id
	private int uid;
	private String name;
	private  Branch branch;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String trainerName;
	
	public Student() {}
	
	public Student(int uid, String name, Branch branch, Date dateOfBirth, String trainerName) {
		super();
		this.uid = uid;
		this.name = name;
		this.branch = branch;
		this.dateOfBirth = dateOfBirth;
		this.trainerName = trainerName;
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
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", branch=" + branch + ", dateOfBirth=" + dateOfBirth
				+ ", trainerName=" + trainerName + "]";
	}
	
	
	
}
