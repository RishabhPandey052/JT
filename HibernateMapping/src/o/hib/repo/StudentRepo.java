package o.hib.repo;

import o.hib.entities.Laptop;
import o.hib.entities.Student;

public interface StudentRepo {
	
	void addStudent(Student stu);

	void startTransaction();

	void endTransaction();
	
	Student getStudent(int rollNo);

	Student updateStudent(Student stu);

	void deleteStudent(Student delStu);

	void addLaptop(Laptop laptop);

	}
