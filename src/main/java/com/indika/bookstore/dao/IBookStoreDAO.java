package com.indika.bookstore.dao;

import java.util.List;

import com.indika.bookstore.entity.Book;

public interface IBookStoreDAO {
	
	List<Book> getBooks();
	Book getBook(int bookId);
	Book createBook(Book book);
	Book updateBook(int bookId,Book book);
	boolean deleteBook(int bookId);

}
