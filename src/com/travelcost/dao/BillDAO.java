package com.travelcost.dao;

import java.util.List;

import com.travelcost.entity.Bill;

public interface BillDAO {
	
	public List<Bill> selectAll();

}
