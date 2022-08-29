package org.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Confriguration {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static EntityManagerFactory getEntityManagerFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		return entityManagerFactory;
		
	}
	public static EntityManager getEntityManager() {
		getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();		
		return entityManager;
	}

}
