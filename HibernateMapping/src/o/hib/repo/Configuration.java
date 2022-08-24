package o.hib.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {
	
	private static EntityManager entityManager;
	private static EntityManagerFactory  entityManagerFactory;
	
	public static void getEntityManagerFactory() {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager() {
		getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
}
