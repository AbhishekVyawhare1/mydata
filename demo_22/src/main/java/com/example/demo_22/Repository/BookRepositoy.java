package com.example.demo_22.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo_22.entities.Book;

public interface BookRepositoy extends MongoRepository<Book, Integer>{

}
