package o.hib;

import java.util.Scanner;

import o.hib.entities.Laptop;
import o.hib.entities.Student;
import o.hib.service.StudentService;
import o.hib.service.StudentServiceImpl;

@SuppressWarnings("unused")
public class Client{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		StudentService sev = new StudentServiceImpl();
		
		do {
			System.out.println("\nEnter your choice \n1:Add a value \n2.Fetching details of particular stu \n4.Update a particular student\n5.Deleting a student\n-1.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
					 // To store a value   
				case 1 :{
							System.out.println(" Adding values the details");
							
//							R1 -- Start (One to one )
							
//							Laptop laptop = new Laptop(1,"HP");
//							sev.addLaptop(laptop);   // add laptop
//							Student stu = new Student(1,"STUD1");
//							stu.setLaptop(laptop);	// add laptop to student
//							
//							sev.addStudent(stu);	// add student
							
//							R1 -- End
							
							
							
//							R21 -- Start  
							
							
//							Laptop laptop1 = new Laptop(11,"HP");
//							Laptop laptop2 = new Laptop(22,"ACER");
//							sev.addLaptop(laptop1);
//							sev.addLaptop(laptop2);
//							
//							Student stu =  new Student(11,"STUD1");
//							stu.getLaptop().add(laptop1);
//							stu.getLaptop().add(laptop2);
//							
//							sev.addStudent(stu);
							
//							R21 -- End
							
//							R22 -- Start  
												
//							Create student and add -- create laptop , set student -- add(mapping laptop)
							
//							Student stu =  new Student(11,"STUD1");
//							sev.addStudent(stu);
//							
//							Laptop laptop1 = new Laptop(11,"HP");
//							Laptop laptop2 = new Laptop(22,"ACER");
//							laptop1.setStudent(stu);
//							laptop2.setStudent(stu);
//							
//							sev.addLaptop(laptop1);
//							sev.addLaptop(laptop2);
//							
							
//							R22 -- End
							
							
//							R3  -- Start
//							Create laptop Student, set students to laptop, add laptop and student
							
							Laptop laptop1 = new Laptop(101,"HP");
							Laptop laptop2 = new Laptop(102,"ACER");
							
							Student stu1 = new Student(3,"STUD3");
							Student stu2 = new Student(4,"STUD4");
							Student stu3 = new Student(5,"STUD5");
 							
							laptop1.getStudents().add(stu1);
							laptop1.getStudents().add(stu2);
							
							laptop2.getStudents().add(stu3);
							laptop2.getStudents().add(stu2);
							laptop2.getStudents().add(stu1);
							
							sev.addLaptop(laptop1);
							sev.addLaptop(laptop2);
							
							sev.addStudent(stu1);
							sev.addStudent(stu2);
							sev.addStudent(stu3);
							
							
							
//							R3  -- End
							System.out.println("Added successfully");
							
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
						
				
				case -1 : System.out.println("Thank You");
						break;
				
				default : System.out.println("Incorrect option");
				
				}
				
			}while(choice!= -1);
				
			System.out.println("ENDED");
			sc.close();
		

	}

}


