package com.lcwd.user.service.UserService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcwd.user.service.UserService.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

	

// if you want to implement any custom method or query

}
