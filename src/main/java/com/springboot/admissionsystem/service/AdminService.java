package com.springboot.admissionsystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.admissionsystem.entity.Admin;
import com.springboot.admissionsystem.repository.AdminRepository;


@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	
	public String addAdmin(Admin admin) {
		adminRepository.save(admin);
		return "Admin User Added";
	}
	public Admin findByEmail(Admin admin) {
		Admin a = adminRepository.findByEmail(admin.getEmail());
		return a;
	} 
	public String updateAdminUserById(Admin admin, int id) {
		admin.setId(id);
		adminRepository.save(admin);
		return "User Updated";
	}
	
	public void deleteAdminUserById(int id) {
		adminRepository.deleteById(id);
	}
	
	public Admin getAdminById(int id) {
		return  adminRepository.findById(id).get();
	}

	
	
}