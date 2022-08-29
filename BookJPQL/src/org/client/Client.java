package org.client;

import org.entities.Book;
import org.service.BookService;
import org.service.BookServiceImpl;

public class Client {
	
	public static void main(String[] args) {
	
		BookService sev = new BookServiceImpl();
		

		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+sev.getBookCount());
		System.out.println();
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Boo with ID 106:"+sev.getBookById(105));
		System.out.println();
		
		System.out.println("************Listing All books*************");
		for(Book book:sev.getAllBooks()) {
			System.out.println(book);
		}
		System.out.println();
		
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book book:sev.getAuthorBooks("Danny Coward") ) {
			System.out.println(book);
		}
		System.out.println();
		
		System.out.println("************Listing book on Android*************");
		for(Book book:sev.getBookByTitle("Android")) {
			System.out.println(book);
		}
		System.out.println();
		
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book:sev.getBooksInPriceRange(500.0, 600.0) ) {
			System.out.println(book);
		
		}
		System.out.println();
		
		
/*		Book b1 = new Book(101, "JAVA", "Martin", 550.0);
		Book b2 = new Book(102, "Android", "Danny Coward", 675.0);
		Book b3 = new Book(103, "C++", "David", 600.0);
		Book b4 = new Book(104, "Android", "Steve", 800.0);
		Book b5 = new Book(105, "Python", "Danny Coward", 575.0);
		Book b6 = new Book(106, "Android", "Smith", 525.0);
		
		sev.addBook(b1); 
		sev.addBook(b2); 
		sev.addBook(b3); 
		sev.addBook(b4); 
		sev.addBook(b5); 
		sev.addBook(b6); 
		
		System.out.println("Added All");
*/
	}
}