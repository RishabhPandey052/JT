package org.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.entities.Branch;
import org.entities.Student;
import org.service.StudentService;
import org.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		
		StudentService sev = new StudentServiceImp();
		
		int choice ;
		
		do {
			System.out.println("\nEnter your choice \n1:Add a Student \n2.Get a student by Id\n3.Get student by trainer \n4.Display total students \n5.Get Students bet dates"+
								"\n6.Get all students\n-1.Exit");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1 : {
						System.out.println("Enter the Uid");
						int uid = sc.nextInt();
						
						System.out.println("Enter the name");
						String name = sc.next();
						
						System.out.println("Enter the Branch");
						String tempBranch = sc.next();
						Branch branch = Branch.valueOf(tempBranch.toUpperCase());
						
						
						System.out.println("Enter the DOB in DD-MM-YYYY");
						String tempDate= sc.next();
						SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
						Date dOB = format.parse(tempDate);
						
						System.out.println("Enter the trainer name");
						String trainerName = sc.next();		
						
						Student stu = new Student(uid, name, branch, dOB, trainerName);
						
						sev.addStudent(stu);
						}
						break;
						
			case 2 : {
						System.out.println("Enter the Uid for search");
						int sUid = sc.nextInt();
						Student searchStudent = sev.getStudent(sUid);
						if(searchStudent != null) {
							System.out.println(searchStudent);
						} else {
							System.out.println("Not Found");
						}
			
					  }
					 	break;
			
			case 3 : {	
						System.out.println("Enter the trainer Name");
						String trainerName = sc.next();
						List<Student> lStudents = sev.getStudentsByTrainerName(trainerName);
						for(Student s : lStudents) System.out.println(s);
					}
					 break;
			case 4 : {	
						
						Long count = sev.getTotalCount();
						System.out.println("Total no of students is " + count);
					}
					break;
					
			case 5 : {	
						System.out.println("Enter date1 in DD-MM-YYYY");
						String tempdate1 = sc.next();
						System.out.println("Enter date2 in DD-MM-YYYY");
						String tempdate2 = sc.next();
						SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
						Date date1 = format.parse(tempdate1);
						Date date2 = format.parse(tempdate2);
						
						List<Student> students = sev.getStudentBetweenDates(date1,date2);
						
						students.forEach(stu ->{System.out.println(stu);});
						
					}
					break;
					
			case 6 : {
						List<Student> allStudents = sev.getAllStudents();
						allStudents.forEach(stu ->{System.out.println(stu);});
					}
					break;
			case -1 : System.out.println("Thank You");
						break;
		
			default : System.out.println("Incorrect option");
			}
		}while(choice != -1);
		
		
		
		
		
				
		
		System.out.println("ENDED");
		sc.close();
		
	}
}

