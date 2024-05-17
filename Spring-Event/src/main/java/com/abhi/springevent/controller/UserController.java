package com.abhi.springevent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.springevent.event.AuditEventPublisher;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private AuditEventPublisher publisher;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		publisher.publishEvent("User Registered Successfully !!!");
		return "User Registered Successfully !!!";
	}

}
