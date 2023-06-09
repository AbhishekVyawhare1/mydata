package com.api.book.kitabrestkitab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.kitabrestkitab.entities.KITAB;
import com.api.book.kitabrestkitab.seervices.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@GetMapping("/service")

	public List<KITAB> getkitab() {
		
		return this.bookservice.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public KITAB getBOOK(@PathVariable("id")int id) {
		return bookservice.getBookById(id);
	}
}
