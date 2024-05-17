package com.abhishek.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import com.abhishek.demo.model.Employee;

public interface EmployeeServices{
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById();
	
	public Boolean deleteEmployeeById(@PathVariable int id);
	
	public Employee updateEmployee(Employee employee);

}
