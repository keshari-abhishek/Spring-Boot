package com.abhi.thirdpartyapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ThirdPartyApiCovidController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<Object> getTotalCases(){
		Object result=restTemplate.getForObject("",Object.class);
		return ResponseEntity.created(null).body(result).status(HttpStatus.FOUND);
	}

}
