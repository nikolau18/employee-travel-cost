package com.travelcost.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.travelcost.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Employee> selectAll(){
        
        List<Employee> employeeList = null;
        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        employeeList = query.getResultList();
        
        if(employeeList == null || employeeList.isEmpty()){
        	System.out.println("list null");
            return null;
        }

        return employeeList;
        
    }

	
	
}
