package com.Security.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.Security.entites.User;

@Component
public interface UserRepository extends MongoRepository<User, Integer> {

	void deleteByUsername(String username);

	

}
