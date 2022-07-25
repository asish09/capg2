package com.springboot.admissionsystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.springboot.admissionsystem.entity.University;
import com.springboot.admissionsystem.service.UniversityService;


@RestController
@CrossOrigin(origins = "http://localhost:8085/")
public class UniversityController {

	@Autowired
	private UniversityService universityService;

	@GetMapping("/university")
	public List<University> getAllUniversity(){
		return universityService.getAllUniversity();
	}
	
	@PostMapping("/university/add")
	public ResponseEntity<?> addUniversity(@RequestBody University university) {
		System.out.println("The University name is :" + university.getUniversityName());
		universityService.addUniversity(university);
		return ResponseEntity.ok(university);
	}
	
	@PutMapping("/university/{id}")
	public String updateUniversityById(@RequestBody University university,@PathVariable int id) {
		return universityService.updateUniversityById(university, id);
	}
	
//	@GetMapping("university/location")
//	public ResponseEntity<List<University>> getUniversityByLocation(@RequestParam String location){
//		return new ResponseEntity<List<University>>(UniversityService.getUniversityByLocation(location),HttpStatus.OK) ;
//	}
	
	@DeleteMapping("/university/delete/{id}")
	public void deleteById(@PathVariable int id) {
		universityService.deleteById(id);
	}
	
	@GetMapping("university/universityName")
	public List<University> getUniversityByUniversityName(@RequestParam String universityName) {
		return universityService.getUniversityByUniversityName(universityName);
	}
	
}
