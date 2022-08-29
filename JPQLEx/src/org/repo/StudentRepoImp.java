package org.repo;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.entities.Student;

public class StudentRepoImp implements StudentRepo {
	
	EntityManager manager;
	
	
	public StudentRepoImp() {
		manager = Confriguration.getEntityManager();
	}
	
	
	
	@Override
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
	public Student getStudent(int uid) {
		Student result = manager.find(Student.class,uid);
		return result;
	}



	@Override
	public List<Student> getStudentsByTrainerName(String trainerName) {
		String query = "SELECT s FROM Student s where s.trainerName like : name";
		TypedQuery<Student> tQuery = manager.createQuery(query,Student.class);
		tQuery.setParameter("name", trainerName);
		List<Student> result = tQuery.getResultList();
		return result;
		
	}


	@Override
	public Long getTotalCount() {
		String query = "SELECT COUNT(s.uid) FROM Student s";
		TypedQuery<Long> tQuery = manager.createQuery(query,Long.class);
		Long count = tQuery.getSingleResult();
		return count;
	}



	@Override
	public List<Student> getStudentBetweenDates(Date date1, Date date2) {
		
		String query = "SELECT s FROM Student s WHERE s.dateOfBirth BETWEEN : low AND :high";
		TypedQuery<Student> tQuery = manager.createQuery(query,Student.class);
		tQuery.setParameter("low", date1);
		tQuery.setParameter("high", date2);
		List<Student> students = tQuery.getResultList();
		return students;
	}



	@Override
	public List<Student> getAllStudents() {
		
		Query query = manager.createNamedQuery("getallStudent");
		List<Student> allStudents = query.getResultList();
		return allStudents;
	}

} 
