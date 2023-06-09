package com.lcwd.user.service.UserService.services;

import java.util.List;

import com.lcwd.user.service.UserService.entities.User;

public interface UserService {

	// User Operations

	// Create
	User saveuser(User user);

	// Get all users
	List<User> getAllUser();

	// Get Single user of given userId

	User getUser(String userId);

	//TODO: delete
	//TODO: Update

	String DeleteUser(String userId);

}
