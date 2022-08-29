package org.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.entities.Book;

public class BookRepoImpl implements BookRepo {
	
	EntityManager manager;
	
	public BookRepoImpl() {
		manager = Confriguration.getEntityManager();
	}

	@Override
	public Long getBookCount() {
		String query = "SELECT COUNT(b.id) FROM Book b";
		TypedQuery<Long> tQuery = manager.createQuery(query, Long.class);
		Long count = tQuery.getSingleResult();
		return count;
	}

	@Override
	public Book getBookById(int i) {
		Book b = manager.find(Book.class,i);
		return b;
	}

	@Override
	public List<Book> getAllBooks() {
		Query query = manager.createNamedQuery("getAllBooks");
		List<Book> lBooks = query.getResultList();
		return lBooks;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		
		String query = "SELECT b FROM Book b WHERE b.author like :name";
		TypedQuery<Book> tQuery = manager.createQuery(query, Book.class);
		tQuery.setParameter("name", author);
		List<Book> lBooks = tQuery.getResultList();
		return lBooks;
	}

	@Override
	public List<Book> getBookByTitle(String topic) {
		
		String query = "SELECT b FROM Book b WHERE b.title like :value";
		TypedQuery<Book> tQuery = manager.createQuery(query,Book.class);
		tQuery.setParameter("value",topic);
		List<Book> lBooks = tQuery.getResultList();
		return lBooks;
	}

	@Override
	public List<Book> getBooksInPriceRange(Double i, Double j) {
		
		String query = "SELECT b FROM Book b WHERE b.price BETWEEN :low AND :high";
		TypedQuery<Book> tQuery = manager.createQuery(query,Book.class);
		tQuery.setParameter("low",i);
		tQuery.setParameter("high",j);
		List<Book> lBooks = tQuery.getResultList();
		return lBooks;
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
	public void addBook(Book book) {
		manager.persist(book);
		
	}
	
	
}
