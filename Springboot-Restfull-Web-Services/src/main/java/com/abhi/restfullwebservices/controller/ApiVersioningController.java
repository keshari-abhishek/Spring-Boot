package com.abhi.restfullwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.restfullwebservices.bean.PersonV1;
import com.abhi.restfullwebservices.bean.PersonV2;

@RestController
public class ApiVersioningController {

	//API versioning using URI
	@GetMapping("/v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Abhishek");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2("Abhishek","Kumar");
	}
	
	//API versioning using Header	
	@GetMapping(value="/person",headers="Accept-version=1.0")
	public PersonV1 getPerson1() {
		return new PersonV1("Ron");
	}
	
	@GetMapping(value="/person",headers="Accept-version=2.0")
	public PersonV2 getPersion2() {
		return new PersonV2("Ron","Don");
	}
	
}
