package com.Project.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Project.mvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
    @GetMapping("/")
    public String vieHomePage(Model model)
    {
    	model.addAttribute("listOfEmployees", employeeService.getAllEMployees());
    	return "index";
    }
}
