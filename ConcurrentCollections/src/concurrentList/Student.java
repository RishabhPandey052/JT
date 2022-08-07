package concurrentList;

public class Student {
	
	private int rollNo;
	private String name;
	private String className;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNO(int uid) {
		this.rollNo = uid;
	}
	public Student(int rollNo, String name, String className) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", className=" + className + "]";
	}
	
	
}
