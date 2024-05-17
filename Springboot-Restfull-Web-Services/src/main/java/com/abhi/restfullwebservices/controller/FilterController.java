package com.abhi.restfullwebservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.restfullwebservices.bean.EmployeeBean;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {

	@GetMapping("/filter")
	public EmployeeBean getEmployee() {
		return new EmployeeBean("Abhishek","1234567890",67686);
	}
	
	@GetMapping("/filter-list")
	public List<EmployeeBean> getEmployeeList(){
		return Arrays.asList(new EmployeeBean("Abhishek","1234567890",67686),
				new EmployeeBean("Rajat","0987654321",6686));
	}
	
	//public MappingJacksonValue retrieveSomeBean()
	
	@GetMapping("filtering")
	public MappingJacksonValue getFilteredEmployee() {
		EmployeeBean employee=new EmployeeBean("Raman","1234567890",75859);
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","dep","mobile");

		SimpleFilterProvider simpleFilterProvider=new SimpleFilterProvider();
		FilterProvider filters = simpleFilterProvider.addFilter("SomeEmployeeBean",filter);
	
		MappingJacksonValue mapping = new MappingJacksonValue(employee);
		mapping.setFilters(filters);  
		return mapping;  
	}
}
