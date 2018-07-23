package com.travelcost.dao;

import java.util.List;

import com.travelcost.entity.BusinessTrip;

public interface BusinessTripDAO {
	
	public List<BusinessTrip> selectAll();

}
