package o.hib.service;

import o.hib.entities.Student;

public interface StudentService {

	void addStudent(Student stu);
	
	Student getStudent(int uid);

	Student updateStudent(Student stu);

	void deleteStudent(Student delStu);

	
	
	
}
