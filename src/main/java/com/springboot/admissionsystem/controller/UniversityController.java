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
import com.springboot.admissionsystem.controller.UniversityController;
import com.springboot.admissionsystem.entity.University;
import com.springboot.admissionsystem.service.UniversityService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UniversityController {
	@Autowired
	private UniversityService universityService;

	@GetMapping("/university")
	public List<University> getAllUniversity(){
		return universityService.getAllUniversity();
	}
	
	@PostMapping("/university/add")
	public void addUniversity(@RequestBody University u) {
		universityService.addUniversity(u);
	}
	
	@PutMapping("/university/{id}")
	public String updateUniversityById(@RequestBody University u,@PathVariable int uid) {
		return universityService.updateUniversityById(u, uid);
	}
	
	@GetMapping("university/university_Name")
	public ResponseEntity<List<University>> getUniversityByName(@RequestParam String university_Name){
		return new ResponseEntity<List<University>>(universityService.getUniversityByName(university_Name),HttpStatus.OK) ;
	}
	
	@DeleteMapping("/university/delete/{id}")
	public void deleteById(@PathVariable int uid) {
		 universityService.deleteById(uid);
	}
	
	@GetMapping("university/location")
	public List<University> getUniversityByLocation(@RequestParam String location) {
		return universityService.getUniversityByLocation(location);
	}
	
}
