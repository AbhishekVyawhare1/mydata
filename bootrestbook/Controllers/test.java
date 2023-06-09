package com.api.book.bootrestbook.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entities.Book;

@RestController
public class test {
	
	@GetMapping("/books")
	public Book bookController() {
		Book book=new Book();
		book.setId(95049);
		book.setAuthor("Megs");
		book.setTitle("Attitude");
		return book;
	}
	

}
