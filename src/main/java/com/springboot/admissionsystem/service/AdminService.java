package com.springboot.admissionsystem.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {
	public boolean validateAdmin(String username, String password) {
		return username.equalsIgnoreCase("Admin")
				&& password.equalsIgnoreCase("password");
	}
}
