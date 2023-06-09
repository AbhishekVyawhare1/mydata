package com.example.mongo_db.mongodb.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo_db.mongodb.entities.Book;
import com.example.mongo_db.mongodb.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookrepository;

	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookrepository.findAll();
	}
	
	@GetMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable int id){
		return bookrepository.findById(id);
	}
	
	@PostMapping("/books")
	public String saveBook(@RequestBody Book book) {
		 bookrepository.save(book);
		 return "Added Book With with ID"+   book.getId();
	}
	
	
	@PutMapping("/books/{id}")
	public String UpdateBook(@RequestBody Book book, @PathVariable int id) {
		
		bookrepository.save(book);
		return "UPDATED SUCCESSFULLY"+ book.getId();
	}
	
	@DeleteMapping("/books/{id}")
	public String DeleteBook(@PathVariable int id) {
		bookrepository.deleteById(id);
		return "Deleted SuccessFully";
	}
}
