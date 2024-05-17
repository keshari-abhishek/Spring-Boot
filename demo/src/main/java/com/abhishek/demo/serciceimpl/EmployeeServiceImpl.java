package com.abhishek.demo.serciceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhishek.demo.dao.EmployeeDao;
import com.abhishek.demo.model.Employee;
import com.abhishek.demo.service.EmployeeServices;

public class EmployeeServiceImpl implements EmployeeServices{
	
	@Autowired 
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee getEmployeeById() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById();
	}

	@Override
	public Boolean deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployeeById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

}
