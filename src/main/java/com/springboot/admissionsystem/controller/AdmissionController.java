package com.springboot.admissionsystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.admissionsystem.entity.Admission;
import com.springboot.admissionsystem.service.AdmissionService;


@RestController
@CrossOrigin(origins = "http://localhost:8085/")
public class AdmissionController {

	@Autowired
	private AdmissionService admissionService;

	@GetMapping("/admission")
	public List<Admission> getAllAdmission(){
		return admissionService.getAllAdmission();
	}
	
	@PostMapping("/admission/add")
	public void addAdmission(@RequestBody Admission f) {
		admissionService.addAdmission(f);
	}
	
	@PutMapping("/admission/{id}")
	public String updateAdmissionById(@RequestBody Admission f,@PathVariable int id) {
		return admissionService.updateAdmissionById(f, id);
	}
	
	@GetMapping("admission/gender")
	public ResponseEntity<List<Admission>> getAdmissionByGender(@RequestParam String gender){
		return new ResponseEntity<List<Admission>>(AdmissionService.getAdmissionByGender(gender),HttpStatus.OK) ;
	}
	
	@DeleteMapping("/admission/delete/{id}")
	public void deleteById(@PathVariable int id) {
		admissionService.deleteById(id);
	}
	
	@GetMapping("admission/firstName")
	public List<Admission> getAdmissionByName(@RequestParam String firstName) {
		return admissionService.getAdmissionByName(firstName);
	}
	
}

