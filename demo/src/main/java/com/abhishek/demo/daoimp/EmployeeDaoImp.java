package com.abhishek.demo.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhishek.demo.dao.EmployeeDao;
import com.abhishek.demo.model.Employee;

@Component
public class EmployeeDaoImp implements EmployeeDao{
	
	@Autowired 
	private JDBCTemplate jDBCTemplate;
	

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return jDBCTemplate;
	}

	@Override
	public Employee getEmployeeById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
