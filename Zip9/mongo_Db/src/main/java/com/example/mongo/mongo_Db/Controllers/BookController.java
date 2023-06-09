package com.example.mongo.mongo_Db.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.mongo_Db.entities.Book;
import com.example.mongo.mongo_Db.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookrepository;
	
	@PostMapping("/addbooks")
	public String saveBook(@RequestBody Book book) {
		bookrepository.save(book);
		return "Added Book With With Id"+ book.getId();
	}
	
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks(){
		return bookrepository.findAll();
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id){
		return bookrepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookrepository.deleteById(id);
		return "Deleted By Id"+id;
	}
}
