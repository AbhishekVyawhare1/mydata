package com.lcwd.user.service.UserService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@Autowired
	private UserService userservice;
	
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1=userservice.saveuser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	
	//SingLe User Get
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleuser(@PathVariable String userId){
		User user2=userservice.getUser(userId);
		return ResponseEntity.ok(user2);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> allusers=userservice.getAllUser();
		return ResponseEntity.ok(allusers);
	}

	

	@DeleteMapping("/{userId}")
	public ResponseEntity<String> DeleteUser(@PathVariable String userId){
		String user=userservice.DeleteUser(userId);
		return ResponseEntity.ok(user);
		
	}
}
