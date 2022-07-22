package com.springboot.admissionsystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.admissionsystem.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	public AdminService adService;
	
//	@RequestMapping(value ="/logind", method = RequestMethod.GET)
//	public String loginDoc(ModelMap model) {
//		System.out.println("Admin's login page");
//		return "logind";
//	}
	@RequestMapping(value ="/logind", method = RequestMethod.POST)
	public String loginPageAdmin(ModelMap model, @RequestParam String username, String password) {
		boolean isValid = adService.validateAdmin(username, password);
		if(!isValid) {
			model.put("errorMessage", "Error!!! Please use the appropriate credentials");
			System.out.println("Invalid credentials");
			return "logind";
		}
		return "displayD";
	}
//	@RequestMapping(value ="/displayD", method = RequestMethod.GET)
//	public String displayD(ModelMap model) {
//		System.out.println("Admin's display page");
//		return "displayD";
//	}
//	@RequestMapping(value ="/displayD", method = RequestMethod.POST)
//	public String displayDPost(ModelMap model) {
//		System.out.println("Admin's diplay page but for post processing");
//		return "checkingStudent";
//	}
	@RequestMapping(value ="/checkingstudent", method = RequestMethod.GET)
	public String checked(ModelMap model) {
		System.out.println("Checking page");
		return "checkingstudent";
	}
	
	@RequestMapping(value ="/checkingPatient", method = RequestMethod.POST)
	public String checkedPage(ModelMap model) {
		System.out.println("Checking page processing");
		return "checked_process";
	}
	@RequestMapping(value ="/checked_process", method = RequestMethod.GET)
	public String checkingProcess(ModelMap model) {
		System.out.println("Checking process");
		return "checked_process";
	}
}
