package com.Project.mvc.service;

import java.util.List;

import com.Project.mvc.model.Employee;

public interface EmployeeService {
  List<Employee>getAllEMployees();
  void saveEmployee(Employee employee);
}
