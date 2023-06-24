package o.hib;

import java.util.Scanner;
import o.hib.entities.Student;
import o.hib.service.StudentService;
import o.hib.service.StudentServiceImpl;

public class StudentApplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StudentService sev = new StudentServiceImpl();
		
//----  To store a value   
		System.out.println("Enter the details");
//		Student stu = new Student(sc.nextInt(),sc.next());
//		Student stu = new Student(1,"rakesh");
//		sev.addStudent(stu);
		
//----  Reteriving
		System.out.println("Enter the uid of student");
//		
//		Student requiredStu = sev.getStudent(sc.nextInt());
//		System.out.println(requiredStu);
//		sc.close();
		
//----  Updating
		System.out.println("Enter the all the details for student for updating");
//		int uid = sc.nextInt();
//		sc.nextLine();
//		String name = sc.nextLine();
		Student recStu = new Student(105,"NA#DSA");
		recStu = sev.updateStudent(recStu);
		
		
//---  	Removing
		
		System.out.println("deleting Enter the uid for that ");
		Student delStu = sev.getStudent(104);
		if(delStu != null) {
			sev.deleteStudent(delStu);
			System.out.println("Deleted" + delStu);
		}else {
			System.out.println("Not found");
		}
		sc.close();
	}

}


/*
void add & delete(pass object find the object with read func )
	persist   remove

classType read(pass PK)
	Find
	
classType update (collect all the parameters)
	merge

 ------
 
 getTransaction.begin()
 getTransaction.commit()
 used in all except read
 *
 *
 */