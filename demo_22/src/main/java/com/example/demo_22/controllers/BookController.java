package com.example.demo_22.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_22.Repository.BookRepositoy;
import com.example.demo_22.entities.Book;

@RestController
public class BookController {

	@Autowired
	BookRepositoy repos;
	
	@GetMapping("/books")
	public List<Book> getAllBook(){
		return repos.findAll();
	}
	
	@PostMapping("/books")
	public String AddBooks(@RequestBody Book b) {
		repos.save(b);
		return "Added Successfully";
	}
}
