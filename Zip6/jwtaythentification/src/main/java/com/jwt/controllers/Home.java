package com.jwt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/Wel")
	public String welcome() {
		String text = "this id private Page";
		text += "this page is not Allowed to unAuthorised Users";
		return text;
	}
}
