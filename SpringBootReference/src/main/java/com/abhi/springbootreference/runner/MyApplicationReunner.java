package com.abhi.springbootreference.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class MyApplicationReunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("This is ApplicationRunner");
		System.out.println("This Will Execute before Application Context");
		System.out.println(args);
		
	}
}
