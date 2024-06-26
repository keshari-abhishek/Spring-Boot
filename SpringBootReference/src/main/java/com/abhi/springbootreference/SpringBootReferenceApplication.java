package com.abhi.springbootreference;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootReferenceApplication {
	
	@Value("${server.port}")
	private static String localPort;
	
	@Value("${myname}")
	private static String myName;
	
	@Value("${spring.application.name}")
	private static String spaName;

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return ()->54;
	}
	public static void main(String[] args) {
		//System.exit(SpringApplication.exit(SpringApplication.run(SpringBootReferenceApplication.class, args)));
		SpringApplication.run(SpringBootReferenceApplication.class, args);
		System.out.println("My Local Port : "+localPort);
		System.out.println("My Name : "+myName);
		System.out.println("My Application Name : "+spaName);

	}

}
