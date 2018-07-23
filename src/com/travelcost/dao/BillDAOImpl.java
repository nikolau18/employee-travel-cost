package com.travelcost.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.travelcost.entity.Bill;

@Repository
public class BillDAOImpl implements BillDAO{

	@Autowired
	private SessionFactory sessionFactory;	
	
	@Transactional
	public List<Bill> selectAll(){
        
        List<Bill> billList = null;
        Session session = sessionFactory.getCurrentSession();
        Query<Bill> query = session.createQuery("from Bill", Bill.class);
        billList = query.getResultList();
        
        if(billList == null || billList.isEmpty()){
        	System.out.println("list null");
            return null;
        }

        return billList;
        
    }



	
	
}
