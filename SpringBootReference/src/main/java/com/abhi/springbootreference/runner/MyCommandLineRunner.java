package com.abhi.springbootreference.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Order(2)
@Component
public class MyCommandLineRunner implements CommandLineRunner{
	
//	@Value("${server.port}")
//	private String localPort;
	
	@Value("${myname}")
	private String myName;
	
	@Value("${spring.application.name}")
	private String spaName;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is CommandLineRunner");
		System.out.println("This Will Execute before Application Context");
		System.out.println(args);

	}
	
	@PostConstruct
	public void init() {
		//System.out.println("My Local Port : "+localPort);
		System.out.println("My Name : "+myName);
		System.out.println("My Application Name : "+spaName);
	}

}
