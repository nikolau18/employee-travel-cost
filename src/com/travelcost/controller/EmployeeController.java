package com.travelcost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travelcost.dao.EmployeeDAO;
import com.travelcost.entity.Employee;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@RequestMapping("/list")
	public String listEmployees(Model model){
		
		List<Employee> employees = employeeDAO.selectAll();
		model.addAttribute("employees", employees);
		return "list-employees";
	}

}
