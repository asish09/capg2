package com.springboot.admissionsystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.admissionsystem.entity.College;
import com.springboot.admissionsystem.service.CollegeService;


@RestController
@CrossOrigin(origins = "http://localhost:8085/")
public class CollegeController {

	@Autowired
	private CollegeService collegeService;

	@GetMapping("/college")
	public List<College> getAllCollege(){
		return collegeService.getAllCollege();
	}
	
	@PostMapping("/college/add")
	public void addCollege(@RequestBody College college) {
		collegeService.addCollege(college);
	}
	
	@PutMapping("/college/{Id}")
	public String updateCollegeById(@RequestBody College e,@PathVariable int id) {
		return collegeService.updateCollegeById(e, id);
	}
	
//	@GetMapping("college/branch")
//	public ResponseEntity<List<College>> getCollegeByBranch(@RequestParam String branch){
//		return new ResponseEntity<List<College>>(CollegeService.getCollegeByBranch(branch),HttpStatus.OK) ;
//	}
	
	@DeleteMapping("/college/delete/{Id}")
	public void deleteById(@PathVariable int id) {
		collegeService.deleteById(id);
	}
	
	@GetMapping("college/collegeName")
	public List<College> getCollegeByName(@RequestParam String collegeName) {
		return collegeService.getCollegeByName(collegeName);
	}
	
}

