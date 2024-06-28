package com.Project.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.mvc.model.Employee;
import com.Project.mvc.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
     @Autowired
     private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEMployees() {
		return employeeRepository.findAll() ;
	}
	@Override
	public void saveEmployee(Employee employee) {
		 employeeRepository.save(employee);
		}

}
