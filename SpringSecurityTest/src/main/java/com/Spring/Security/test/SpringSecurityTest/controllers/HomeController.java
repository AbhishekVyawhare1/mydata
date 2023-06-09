package com.Spring.Security.test.SpringSecurityTest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@GetMapping("/Normal")
	public ResponseEntity<String> NormalUser(){
		return ResponseEntity.ok("Yes I'm Normal User");
	}
	
	@GetMapping("/Admin")
	public ResponseEntity<String> AdminUser(){
		return ResponseEntity.ok("Yes I'm Admin User");
	}
	
	@GetMapping("/Public")
	public ResponseEntity<String> PublicUser(){
		return ResponseEntity.ok("Yes I'm Public User");
	}
}
