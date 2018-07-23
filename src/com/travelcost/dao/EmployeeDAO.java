package com.travelcost.dao;

import java.util.List;

import com.travelcost.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> selectAll();

}
