package com.abhi.springsecurity.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.springsecurity.model.User;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	
	private  List<User> users= new ArrayList<>(List.of(new User(1,"Abhishek"),new User(2,"Raj")));
	
	@GetMapping("/hello")
	public String welcome(){
		return "Wellcome to String Security";
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return users;
	}
	
	@PostMapping("/add-user")
	public List<User> addUser(@RequestBody User user){
		 users.add(user);
		 return users;
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getToken(HttpServletRequest request) {
		return  (CsrfToken) request.getAttribute("_csrf");
	}

}
