package com.travelcost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travelcost.dao.BusinessTripDAO;
import com.travelcost.entity.BusinessTrip;


@Controller
@RequestMapping("/business-trip")
public class BusinessTripController {
	
	@Autowired
	private BusinessTripDAO businessTripDAO;
	
	@RequestMapping("/list")
	public String listBusinessTrips(Model model){
		
		List<BusinessTrip> businessTrips = businessTripDAO.selectAll();
		model.addAttribute("businessTrips", businessTrips);
		return "list-business-trips";
	}

}
