package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.EmployeeRestfulWebServiceApplication;
import com.cognizant.springlearn.entity.Employee;
import com.cognizant.springlearn.service.EmployeeService;

@RestController
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRestfulWebServiceApplication.class);
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees()
	{
		LOGGER.info("Employee Controller method getAllEmployees()  START");
		
		LOGGER.info("Employee Controller method getAllEmployees() END");
		return employeeService.getAllEmployees();
	}
}
