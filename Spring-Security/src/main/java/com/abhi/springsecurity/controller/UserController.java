package com.abhi.springsecurity.controller;

import com.abhi.springsecurity.model.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
	
	@GetMapping("/welcome")
	public String welcome(){
		return "This is not secure API";
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return Arrays.asList(new User(1,"Abhishek"),new User(2,"Raj"));
	}

}
