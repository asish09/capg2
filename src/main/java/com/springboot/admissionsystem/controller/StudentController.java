package com.springboot.admissionsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.admissionsystem.service.StudentService;


//@ResponseBody
@Controller
public class StudentController {

	@Autowired
	private StudentService stuService;
	
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		System.out.println("Login Page");
		return "login";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String logPage(ModelMap model, @RequestParam String userid, @RequestParam String password) {
		boolean valid =stuService.validateUser(userid, password);
		if(!valid) {
			model.put("errorMessage", "Error!!! Please use the appropriate credentials");
			System.out.println("Invalid credentials");
			return"login";
		}
		return "display";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		System.out.println("This is the welcome page");
		return "welcome";
	}

	@RequestMapping(value = "/pat_details_input", method = RequestMethod.GET)
	public String regPage(ModelMap model) {
		return "stu_details_input";
	}

	@RequestMapping(value = "/stu_details_input", method = RequestMethod.POST)
	public String showRegistrationPage(ModelMap model, @RequestParam String student_name, String date_of_birth, String email, String phone, String father_name, String mother_name, String address) {
		stuService.savestudent(student_name, date_of_birth, email, phone, father_name, mother_name, address);
		System.out.println("You have been redirected to the registration page!!");
		return "success_regd";
	}
	
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String displayPage(ModelMap model) {
		System.out.println("This is the display page.");
		return "display";
		}
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public String displayPageResponse(ModelMap model) {
		System.out.println("This is the display page.");
		return "update";
		}


	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deletePage(ModelMap model) {
		System.out.println("This is the delete page.");
		return "delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deletePagePost(ModelMap model) {
		System.out.println("Record Deleted.");
		return "display";
	}


	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String changesPage(ModelMap model) {
		System.out.println("This is the updation page.");
		return "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePage(ModelMap model) {
		System.out.println("This is the page for updating student info.");
		return "update_process";
	}
	
	@RequestMapping(value = "/update_process", method = RequestMethod.GET)
	public String updateprocessPage(ModelMap model) {
		System.out.println("This is the updation process page.");
		return "update_process";
	}

	

}
