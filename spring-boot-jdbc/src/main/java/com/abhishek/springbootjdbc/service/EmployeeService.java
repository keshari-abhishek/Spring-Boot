package com.abhishek.springbootjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertEmployee() {
		try {
			jdbcTemplate.execute("insert into employee values('1','Abhishek','abhishek@gmail.com')");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
