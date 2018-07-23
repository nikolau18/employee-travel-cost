package com.travelcost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travelcost.dao.BillDAO;
import com.travelcost.entity.Bill;


@Controller
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillDAO billDAO;
	
	@RequestMapping("/list")
	public String listBills(Model model){
		
		List<Bill> bills = billDAO.selectAll();
		model.addAttribute("bills", bills);
		return "list-bills";
	}

}
