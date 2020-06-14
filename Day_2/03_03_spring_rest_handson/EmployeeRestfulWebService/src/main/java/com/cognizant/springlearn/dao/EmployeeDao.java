package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.EmployeeRestfulWebServiceApplication;
import com.cognizant.springlearn.entity.Employee;

@Service
public class EmployeeDao {

	private static ArrayList<Employee> EMPLOYEE_LIST;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRestfulWebServiceApplication.class);
	
	public EmployeeDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = context.getBean("employeeList", ArrayList.class);
	}

	public ArrayList<Employee> getAllEmployees()
	{
		LOGGER.info("Employee DAO method getAllEmployees() START");
		
		
		EMPLOYEE_LIST.forEach(value->LOGGER.debug(value.toString()) );
		
		LOGGER.info("Employee DAO method getAllEmployees() END");
		return EMPLOYEE_LIST;
	}
}
