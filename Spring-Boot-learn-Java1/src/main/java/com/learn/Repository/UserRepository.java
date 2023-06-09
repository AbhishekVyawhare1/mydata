package com.learn.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.learn.model.User;

@Component
public interface UserRepository extends MongoRepository<User, String>{


	void deleteByUsername(String username);



}
