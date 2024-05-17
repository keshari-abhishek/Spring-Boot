package com.abhi.restfullwebservices.bean;

public class HelloBean {
	
	private String message;

	public HelloBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
