package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import com.api.book.bootrestbook.entities.Book;

public class BookService {

	private static List<Book> list = new ArrayList<>();

	
	
	static {
		list.add(new Book(1,"Mind Your Own Business","Abhishek"));

		list.add(new Book(2,"Attitute","megs"));

		list.add(new Book(3,"Rich Dad Poor Dad","Prathamesh"));

	}
	
	//get all books
	
	
}
