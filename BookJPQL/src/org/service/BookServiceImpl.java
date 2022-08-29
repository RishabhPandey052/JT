package org.service;

import java.util.List;

import org.entities.Book;
import org.repo.BookRepo;
import org.repo.BookRepoImpl;

public class BookServiceImpl implements BookService {
	
	BookRepo repo;
	
	public BookServiceImpl() {
		repo = new BookRepoImpl();
	}

	@Override
	public Long getBookCount() {
		
		Long count = repo.getBookCount();
		return count;
	}

	@Override
	public Book getBookById(int i) {
		Book b = repo.getBookById(i);
		return b;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> lBooks = repo.getAllBooks();
		return lBooks;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		List<Book> lBooks = repo.getAuthorBooks(author);
		return lBooks;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		List<Book> lBooks = repo.getBookByTitle(title);
		return lBooks;
	}

	@Override
	public List<Book> getBooksInPriceRange(Double i, Double j) {
		List<Book> lBooks = repo.getBooksInPriceRange(i,j);
		return lBooks;
	}

	@Override
	public void addBook(Book book) {
		repo.startTransaction();
		repo.addBook(book);
		repo.endTransaction();
		
	}

}
