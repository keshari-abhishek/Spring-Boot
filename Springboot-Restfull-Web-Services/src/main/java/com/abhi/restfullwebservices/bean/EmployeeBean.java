package com.abhi.restfullwebservices.bean;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeEmployeeBean")
//@JsonIgnoreProperties({"name","mobile"})
public class EmployeeBean {
	
	private String name;
	private String mobile;
	private int salary;
	public EmployeeBean(String name, String mobile, int salary) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
