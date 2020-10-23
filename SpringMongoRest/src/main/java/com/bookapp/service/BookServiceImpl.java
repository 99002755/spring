package com.bookapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookServiceImpl implements BookService {
@Autowired
BookRepository bookRepository;
	

	@Override
	public Book addBook(Book book) {
 Book newBook=bookRepository.save(book);
		return newBook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException {
		bookRepository.deleteById(bookid);
		return true;
	}

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException {
	return bookRepository.findById(bookid)
		.orElseThrow(()->new BookNotFoundException("ID Not Found"));
	
	}

	@Override
	public Book updateBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {

		return bookRepository.findAll();	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
	       return bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> getBookBycategory(String category) throws BookNotFoundException {
		return bookRepository.findByCategoryOrderByTitle(category);
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitleAndAuthor(title,author);
	}

	@Override
	public List<Book> findBookByTitleAndPrice(String title, Double price) {
		// TODO Auto-generated method stub
		return bookRepository.findBookByTitleAndPrice(title,price);
	}

}
