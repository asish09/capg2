package com.springboot.admissionsystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.admissionsystem.entity.Admin;
import com.springboot.admissionsystem.service.AdminService;



@RestController
@CrossOrigin(origins = "http://localhost:8085/")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@PostMapping("/admin/add")
	public ResponseEntity<?> addAdmin(@RequestBody Admin admin) {
		 adminService.addAdmin(admin);
		 Admin admin1 = adminService.findByEmail(admin);
		 return ResponseEntity.ok(admin1);
	}
	@PutMapping("/admin/{id}")
	public String updateAdminById(@RequestBody Admin admin,@PathVariable int id) {
		return adminService.updateAdminUserById(admin, id);
	}
	
	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable int id) {
		return adminService.getAdminById(id);
	}
	
	@DeleteMapping("/admin/delete/{id}")
	public void deleteById(@PathVariable int id) {
		adminService.deleteAdminUserById(id);
	}
}

	

