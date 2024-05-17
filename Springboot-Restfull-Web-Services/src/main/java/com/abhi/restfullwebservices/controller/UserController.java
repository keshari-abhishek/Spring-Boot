package com.abhi.restfullwebservices.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.abhi.restfullwebservices.bean.User;
import com.abhi.restfullwebservices.customexception.UserNotFountException;
import com.abhi.restfullwebservices.dao.UserDao;
  

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/all-users")
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Integer id) {
		User user= userDao.getUserById(id);
		if(user==null) {
			throw new UserNotFountException("Id : "+id);
		}
//	       Link selfLink = linkTo(UserController.class).slash(id).withSelfRel();
//	        user.add(selfLink);
		return user;
	}
	
	@PostMapping("/save-user")
	public ResponseEntity<Object> addUser(@Valid @RequestBody User user) {
		User result=userDao.addUser(user);
			URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(result.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/user/{id}")
	public User deleteUserById(@PathVariable Integer id) {
		User user=userDao.deleteUserById(id);
		if(user==null) {
			throw new UserNotFountException("Id : "+id);
		}
		return user;
	}

}
