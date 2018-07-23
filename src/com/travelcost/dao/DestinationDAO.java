package com.travelcost.dao;

import java.util.List;

import com.travelcost.entity.Destination;

public interface DestinationDAO {
	
	public List<Destination> selectAll();

}
