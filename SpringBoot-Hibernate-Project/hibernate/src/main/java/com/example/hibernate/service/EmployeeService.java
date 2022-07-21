package com.example.hibernate.service;

import java.util.List;

import com.example.hibernate.exception.ResourceNotFoundException;
import com.example.hibernate.model.Employee;



public interface EmployeeService {
     Employee saveEmployee(Employee employee);
     List<Employee> getAllEmployees();
     Employee getEmployeeById(long id) throws ResourceNotFoundException ;
     Employee updateEmployee(Employee employee,long id) throws ResourceNotFoundException;
     void deleteEmployee(long id);
	
}
