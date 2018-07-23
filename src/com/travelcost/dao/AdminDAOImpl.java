package com.travelcost.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.travelcost.entity.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Admin> selectAll(){
        
        List<Admin> adminList = null;
        Session session = sessionFactory.getCurrentSession();
        Query<Admin> query = session.createQuery("from Admin", Admin.class);
        adminList = query.getResultList();
        
        if(adminList == null || adminList.isEmpty()){
        	System.out.println("list null");
            return null;
        }

        return adminList;
        
    }



	
	
}
