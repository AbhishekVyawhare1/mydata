package com.example.demo_22.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="hello")
public class Book {

	
	private int Id;
	private String bookname;
	private String author;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int id, String bookname, String author) {
		super();
		Id = id;
		this.bookname = bookname;
		this.author = author;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", bookname=" + bookname + ", author=" + author + "]";
	}
	
	
	
	
	
}
