package o.hib.service;

import o.hib.entities.Student;
import o.hib.repo.StudentRepo;
import o.hib.repo.StudentRepoImpl;

public class StudentServiceImpl implements StudentService {

	StudentRepo repo;
	
	public StudentServiceImpl() {
		repo = new StudentRepoImpl();
	}
	@Override
	public void addStudent(Student stu) {
		repo.startTransaction();
		repo.addStudent(stu);
		repo.endTransaction();
	}
	
	@Override
	public Student getStudent(int rollNo) {
		Student stu = repo.getStudent(rollNo);
		return stu;
		
	}
	@Override
	public Student updateStudent(Student stu) {
		repo.startTransaction();
		Student updateStu = repo.updateStudent(stu);
		repo.endTransaction();
		return updateStu;
	}
	@Override
	public void deleteStudent(Student delStu) {
		repo.startTransaction();
		repo.deleteStudent(delStu);
		repo.endTransaction();
		
	}
	
	

}
