package org.service;

import java.util.List;

import org.entities.Book;

public interface BookService {

	Long getBookCount();

	Book getBookById(int i);

	List<Book> getAllBooks();

	List<Book> getAuthorBooks(String author);

	List<Book> getBookByTitle(String string);

	List<Book> getBooksInPriceRange(Double i, Double j);

	void addBook(Book book);

}
