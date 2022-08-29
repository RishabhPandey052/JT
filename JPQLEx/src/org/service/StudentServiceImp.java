package org.service;

import java.util.Date;
import java.util.List;

import org.entities.Student;
import org.repo.StudentRepo;
import org.repo.StudentRepoImp;

public class StudentServiceImp implements StudentService {

	StudentRepo repo;
	
	public StudentServiceImp(){
		repo = new StudentRepoImp();
	}
	@Override
	public void addStudent(Student stu) {
		repo.startTransaction();
		repo.addStudent(stu);
		repo.endTransaction();
		
	}
	@Override
	public Student getStudent(int nextInt) {
		Student stu = repo.getStudent(nextInt);
		return stu;
	}
	@Override
	public List<Student> getStudentsByTrainerName(String trainerName) {
		List<Student>  lStudents= repo.getStudentsByTrainerName(trainerName);
		return lStudents;
	}
	@Override
	public Long getTotalCount() {
		Long count = repo.getTotalCount();
		return count;
	}
	@Override
	public List<Student> getStudentBetweenDates(Date date1, Date date2) {
		List<Student> students = repo.getStudentBetweenDates(date1,date2);
		return students;
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> allStudents = repo.getAllStudents();
		return allStudents;
	}
	
	
	

}
