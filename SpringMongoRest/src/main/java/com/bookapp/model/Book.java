package com.bookapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
@TypeAlias("Book")
public class Book {
	@Id
	Integer bookId;
	String author;
	String title;
	String category;
	Double price;
	public Book() {
		super();
	}
	public Book(Integer bookId, String author, String title, String category, Double price) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.category = category;
		this.price = price;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", title=" + title + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	

}

