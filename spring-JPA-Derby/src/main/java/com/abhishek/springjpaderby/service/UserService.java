package com.abhishek.springjpaderby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.springjpaderby.model.UserRecord;
import com.abhishek.springjpaderby.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserRecord saveUser(UserRecord userRecord) {
		return userRepository.save(userRecord);
	}
	
	public List<UserRecord> getAllUsers(){
		return (List<UserRecord>) userRepository.findAll();
	}

}
