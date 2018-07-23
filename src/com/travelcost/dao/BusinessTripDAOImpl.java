package com.travelcost.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.travelcost.entity.BusinessTrip;

@Repository
public class BusinessTripDAOImpl implements BusinessTripDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<BusinessTrip> selectAll(){
        
        List<BusinessTrip> businessTripList = null;
        Session session = sessionFactory.getCurrentSession();
        Query<BusinessTrip> query = session.createQuery("from BusinessTrip", BusinessTrip.class);
        businessTripList = query.getResultList();
        
        if(businessTripList == null || businessTripList.isEmpty()){
        	System.out.println("list null");
            return null;
        }

        return businessTripList;
        
    }



	
	
}
