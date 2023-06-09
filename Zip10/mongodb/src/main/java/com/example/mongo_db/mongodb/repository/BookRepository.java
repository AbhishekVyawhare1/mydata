package com.example.mongo_db.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo_db.mongodb.entities.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
