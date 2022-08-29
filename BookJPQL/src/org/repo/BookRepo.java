package org.repo;

import java.util.List;

import org.entities.Book;

public interface BookRepo {

	Long getBookCount();

	Book getBookById(int i);

	List<Book> getAllBooks();

	List<Book> getAuthorBooks(String author);

	List<Book> getBookByTitle(String title);

	List<Book> getBooksInPriceRange(Double i, Double j);

	void startTransaction();

	void endTransaction();

	void addBook(Book book);

}
