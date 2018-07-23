package com.travelcost.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.travelcost.entity.Destination;

@Repository
public class DestinationDAOImpl implements DestinationDAO {

	@Autowired
	private SessionFactory sessionFactory;	
	
	@Transactional
	public List<Destination> selectAll(){
        
        List<Destination> destinationList = null;
        Session session = sessionFactory.getCurrentSession();
        Query<Destination> query = session.createQuery("from Destination", Destination.class);
        destinationList = query.getResultList();
        
        if(destinationList == null || destinationList.isEmpty()){
        	System.out.println("list null");
            return null;
        }

        return destinationList;
        
    }

	
	
}
