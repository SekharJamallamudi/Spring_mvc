package com.Project.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.mvc.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
