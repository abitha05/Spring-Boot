package com.example.hibernate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.hibernate.exception.ResourceNotFoundException;
import com.example.hibernate.model.Employee;
import com.example.hibernate.repository.EmployeeRepository;
import com.example.hibernate.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeerepository;
    
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeerepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) throws ResourceNotFoundException {
		return employeerepository.findById(id).orElseThrow(()->
		     new ResourceNotFoundException("Employee","Id",id));}

	@Override
	public Employee updateEmployee(Employee employee, long id) throws ResourceNotFoundException {
	        Employee existingEmployee=employeerepository.findById(id).orElseThrow((
	        		)->new  ResourceNotFoundException("Employee","Id",id));
	        existingEmployee.setFirstName(employee.getFirstName());
	        existingEmployee.setLastName(employee.getLastName());
			return existingEmployee;
	}
    @Override
	public void deleteEmployee(long id) {
		employeerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
		 employeerepository.deleteById(id);
		
	}

}
