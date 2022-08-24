package o.hib.repo;

import javax.persistence.EntityManager;

import o.hib.entities.Student;

public class StudentRepoImpl implements StudentRepo {
	
	EntityManager manager ;

	public StudentRepoImpl() {
		manager = Configuration.getEntityManager();
	}
	public void addStudent(Student stu) {
		manager.persist(stu);
		
	}
	@Override
	public void startTransaction() {
		manager.getTransaction().begin();
		
	}
	@Override
	public void endTransaction() {
		manager.getTransaction().commit();
		
	}
	@Override
	public Student getStudent(int rollNo) {
		Student result = manager.find(Student.class,rollNo);
		return result;
	}
	@Override
	public Student updateStudent(Student stu) {
		Student result = manager.merge(stu);
		return result;
	}
	@Override
	public void deleteStudent(Student delStu) {
		manager.remove(delStu);
		
	}
	

}
