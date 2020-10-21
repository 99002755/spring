package com.bookapp.service;
import java.util.*;

import com.bookapp.model.Book;

public interface BookService {
	List<Book> getAllBooks();
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String category);
	Book getById(int id);

}
//////////////////////////////////
service implemetation
package com.bookapp.service;

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookDAOImpl;
import com.bookapp.model.Book;
import java.util.List;

import com.bookapp.model.Book;

public class BookServiceImpl implements BookService {
     BookDAO bookDAo = new BookDAOImpl();
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAo.getAllBooks();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAo.getByAuthor(author);
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return bookDAo.getByCategory(category);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAo.getById(id);
	}

}
