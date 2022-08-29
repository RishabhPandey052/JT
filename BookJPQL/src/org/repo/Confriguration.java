package org.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Confriguration {
	
	public static EntityManagerFactory entityManagerFactory;
	public static EntityManager entityManager;
	
	public static void getEntityManagerFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager() {
		getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	
	
	
	
}
