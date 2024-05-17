package com.abhishek.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.demo.model.Employee;
import com.abhishek.demo.service.EmployeeServices;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices; 
	
	public List<Employee> getAllEmployee(){
		return employeeServices.getAllEmployee();
	}
	
	public Employee getEmployeeById(){
		return employeeServices.getEmployeeById();
	}
	
	public Boolean deleteEmployeeById(@PathVariable int id){
		return employeeServices.deleteEmployeeById(id);
	}
	
	public Employee updateEmployee(Employee employee){
		return employeeServices.updateEmployee(employee);
	}

}
