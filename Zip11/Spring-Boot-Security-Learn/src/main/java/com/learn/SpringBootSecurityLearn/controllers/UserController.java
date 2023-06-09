package com.learn.SpringBootSecurityLearn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.SpringBootSecurityLearn.models.User;
import com.learn.SpringBootSecurityLearn.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;

	// All User
	@GetMapping("/")
	public List<User> getAllUsers() {
		return this.userservice.getAllUSERS();
	}

	// return Single User
	@GetMapping("/{username}")
	public User getbyname(@PathVariable("username") String username) {
		return this.userservice.getUser(username);
	}

	@PostMapping("/")
	public User AddUser(@RequestBody User user) {
		return this.userservice.addUser(user);
	}
}
