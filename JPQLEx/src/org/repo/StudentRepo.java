package org.repo;

import java.util.Date;
import java.util.List;

import org.entities.Student;

public interface StudentRepo {

	void addStudent(Student stu);

	void startTransaction();

	void endTransaction();

	Student getStudent(int nextInt);

	List<Student> getStudentsByTrainerName(String trainerName);

	Long getTotalCount();

	List<Student> getStudentBetweenDates(Date date1, Date date2);

	List<Student> getAllStudents();

}
