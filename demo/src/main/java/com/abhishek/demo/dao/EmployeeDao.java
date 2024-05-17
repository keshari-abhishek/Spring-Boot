package com.abhishek.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.abhishek.demo.model.Employee;

@Component
public interface EmployeeDao {

	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById();
	
	public Boolean deleteEmployeeById(@PathVariable int id);
	
	public Employee updateEmployee(Employee employee);
}
