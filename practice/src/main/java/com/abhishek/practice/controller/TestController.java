package com.abhishek.practice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	@Value("${server.port}")
	private int serverPort;
	
	@RequestMapping("/home")
	public String getHome() {
		System.out.println("This is Home");
		return "home";
	}
	
	@RequestMapping("/about")
	public String getAbout() {
		System.out.println("This is About");
		return "about";
	}
	
	@GetMapping("/get-server-port")
	public int getServerPort() {
		return serverPort;
	}
	
	@GetMapping(value={"/path-variable","/path-variable/{myVariable}"})
	public String testPathVariable(@PathVariable Optional<String> myVariable) {
		return myVariable.get()==null?"No value":myVariable.get();
	}

}
