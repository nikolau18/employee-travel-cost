package com.travelcost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travelcost.dao.DestinationDAO;
import com.travelcost.entity.Destination;


@Controller
@RequestMapping("/destination")
public class DestinationController {
	
	@Autowired
	private DestinationDAO destinationDAO;
	
	@RequestMapping("/list")
	public String listDestinations(Model model){
		
		List<Destination> destinations = destinationDAO.selectAll();
		model.addAttribute("destinations", destinations);
		return "list-destinations";
	}

}
