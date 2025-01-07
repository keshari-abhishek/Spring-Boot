package com.abhi.restfulservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private final String greeting="Wellcome %S";
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(defaultValue="World") String name ) {
		return String.format(greeting, name);
	}

}
