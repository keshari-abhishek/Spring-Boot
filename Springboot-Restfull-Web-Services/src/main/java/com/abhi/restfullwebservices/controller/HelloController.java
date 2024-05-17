package com.abhi.restfullwebservices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.restfullwebservices.bean.HelloBean;

@RestController
public class HelloController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello from Springboot Restfull web service";
	}
	
	@GetMapping("/hello-bean")
	public HelloBean getHelloBean() {
		return new HelloBean("Hello from Springboot Restfull web service HelloBean");
	}
	
	@GetMapping("/hello/{name}")
	public String sayHelloTo(@PathVariable String name ) {
		return "Hello Mr. "+name;
	}
	
	@GetMapping("/hello-int")
	public String getIntHello(@RequestHeader(name="Accept-Language", required=false)
	Locale locale) {
		return messageSource.getMessage("morning.messages", null, locale); 
	}

}
