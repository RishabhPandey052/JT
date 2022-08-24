package o.hib;

import java.util.Scanner;

import o.hib.entities.C2TC;
import o.hib.entities.Student;
import o.hib.service.StudentService;
import o.hib.service.StudentServiceImpl;

public class Client {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		StudentService sev = new StudentServiceImpl();
		
		do {
			System.out.println("\nEnter your choice \n1:Add a value \n2.Fetching details of particular stu \n4.Update a particular student\n5.Deleting a student\n-1.Exit");
			System.out.println("6:Add a C2TC \n7.Fetching details of particular C2TC \n8.Update a particular C2TC\n9.Deleting a C2TC\n");
			choice = sc.nextInt();
			
			switch(choice)
			{
					 // To store a value   
				case 1 :{
							System.out.println("Enter the details");
							Student stu = new Student(sc.nextInt(),sc.next());
							sev.addStudent(stu);
						}
						break;
				
					  //  Reteriving
				case 2 : {
							System.out.println("Enter the uid of student");							
							Student requiredStu = new Student();
							requiredStu.setUid(sc.nextInt());
							requiredStu = sev.getStudent(requiredStu.getUid());
							if(requiredStu != null) {
								System.out.println(requiredStu);
							} else {
								System.out.println(" Not Found ");
							}
						}
						break;
						
					// update
				case 4 : {
							System.out.println("Enter the all the details for student for updating");
							int uid = sc.nextInt();
							sc.nextLine();
							String name = sc.nextLine();
							Student recStu = new Student(uid,name);
							recStu = sev.updateStudent(recStu);
						
						}
						break;
						
					// 	delete
				case 5 : {
							System.out.println("deleting Enter the uid for that ");
							int delID = sc.nextInt();
							Student delStu = sev.getStudent(delID);
							if(delStu != null) {
								sev.deleteStudent(delStu);
								System.out.println("Deleted" + delStu);
							}else {
								System.out.println( delID + " Not found ");
							}
							
						}
						break;
						
						//Adding A C2TC stu
				case 6 :{
							System.out.println("Enter the details Adding for C2TC student");
							C2TC c2tcStu = new C2TC(sc.nextInt(),sc.next(), sc.next(), sc.next());
							sev.addStudent(c2tcStu);
						}
						break;	
						
				case 7 :{
							System.out.println("Enter the uid of C2TC student");
							C2TC requiredStu = new C2TC();
							requiredStu.setUid(sc.nextInt());
							requiredStu = (C2TC) sev.getStudent(requiredStu.getUid());
							if(requiredStu != null) {
								System.out.println(requiredStu);
							} else {
								System.out.println(" Not Found ");
							}
							
						}
						break;
						
						//Updating A C2TC stu
				case 8:{
							
							System.out.println("Enter details for Updating C2TC student");
							C2TC updatedC2TCStu = new C2TC(sc.nextInt(),sc.next(), sc.next(), sc.next());
							sev.updateStudent(updatedC2TCStu);
						}
						break;
						
						//Deleting C2TC stu
				case 9:{
							System.out.println("Enter the uid of C2TC student for deleting");
							int delIDC2TC = sc.nextInt();
							C2TC delC2TCStu = (C2TC) sev.getStudent(delIDC2TC);
							if(delC2TCStu != null) {
								sev.deleteStudent(delC2TCStu);
								System.out.println(delC2TCStu);
							}else {
								System.out.println(delIDC2TC + " Not Found ");
							}
						}
						break;
				case -1 : System.out.println("Thank You");
						break;
				
				default : System.out.println("Incorrect option");
				
				}
				
			}while(choice!= -1);
				
			System.out.println("ENDED");
			sc.close();
		

	}

}

/*
 while printing child obj use its To string 
 its gets casted to its parent
 


 */
