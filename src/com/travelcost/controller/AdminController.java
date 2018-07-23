package com.travelcost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travelcost.dao.AdminDAO;
import com.travelcost.entity.Admin;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminDAO adminDAO;
	
	@RequestMapping("/list")
	public String listAdmins(Model model){
		
		List<Admin> admins = adminDAO.selectAll();
		model.addAttribute("admins", admins);
		return "list-admins";
	}

}
