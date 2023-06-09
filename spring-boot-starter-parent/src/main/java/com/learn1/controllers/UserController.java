package com.learn1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn1.model.User;
import com.learn1.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;

	
	// All User
	@GetMapping("/Get")
	public List<User> getAllUsers() {
		return this.userservice.getAllUSERS();
	}

	// return Single User
	@GetMapping("/{username}")
	public User getbyname(@PathVariable("username") String username) {
		return this.userservice.getUser(username);
	}

	@PostMapping("/Add")
	public User AddUser(@RequestBody User user) {
		User u=this.userservice.addUser(user);
		return  u;
	}
	
}
