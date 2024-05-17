package com.abhi.restfullwebservices.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abhi.restfullwebservices.bean.User;

@Service
public class UserDao {
	
	private static int count=5;
	private static List<User> userList=new ArrayList<>();
	
	static {
		userList.add(new User(1,"Abhi","abhi@gmail.com"));
		userList.add(new User(2,"Jhon","jhoni@gmail.com"));
		userList.add(new User(3,"Sam","sam@gmail.com"));
		userList.add(new User(4,"Pipin","pipin@gmail.com"));
		userList.add(new User(5,"Hound","hound@gmail.com"));
	}
	
	public List<User> getAllUsers(){
		return userList;
	}
	
	public User getUserById(int id) {
		User result=null;
		for(User user:userList) {
			if(user.getId()==id) {
				result=user;
			}
		}
		return result;
	}
	
	public User addUser(User user) {
		if(user.getId()==null) {
			user.setId(++count);
			userList.add(user);
		}
		return user;
	}
	
	public User deleteUserById(Integer id) {
		
		Iterator<User> iterator=userList.iterator();
		while(iterator.hasNext()) {
			User user=iterator.next();
			if(user.getId()==id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
