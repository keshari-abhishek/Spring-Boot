package com.abhi.restfullwebservices.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFountException extends RuntimeException {

	public UserNotFountException(String msg){
		super(msg);
	}
}
