package com.abhishek.springjpaderby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.springjpaderby.model.UserRecord;
import com.abhishek.springjpaderby.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("save-user")
	public UserRecord saveUser(@RequestBody UserRecord userRecord) {
		return userService.saveUser(userRecord);
	}
	
	@GetMapping("get-users")
	public List<UserRecord> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("home")
	public String goHome(){
		return "Wellcome to Springboot Derby Application";
	}

}
