package com.learn1.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn1.model.User;
@Service
public class UserService {

	List<User> list = new ArrayList<>();

	public UserService() {
		list.add(new User("abc", "abc", "ABC@gmail.com"));
		list.add(new User("xyz", "xyz", "X@gmail.com"));

	}

	// getAllUsers
	public List<User> getAllUSERS() {
		return this.list;
	}

	// getSingleUsers
	public User getUser(String username) {
		return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
	}

	
	// add new User
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
