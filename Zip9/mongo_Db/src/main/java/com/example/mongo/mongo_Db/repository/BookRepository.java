package com.example.mongo.mongo_Db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.mongo_Db.entities.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
