package com.abhi.restfullwebservices.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class User {
	
	private Integer id;
	@Size(min=3, message="Name length must be at least 3")
	private String name;
	@Email(message="Please provide correct email id")
	private String email;
	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
