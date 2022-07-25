package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.admissionsystem.entity.College;
import com.springboot.admissionsystem.repository.CollegeRepository;
@Service
public class CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;

	public List<College> getAllCollege(){
		return (List<College>) collegeRepository.findAll();
		
	}
	public String addCollege(College college) {
		collegeRepository.save(college);
		return "College Added";
	}
	public String updateCollegeById(College college, int id) {
		college.setId(id);
		collegeRepository.save(college);
		return "College Updated";
	}
	// public static List<College> getCollegeByBranch(String branch){
	// 	return collegeRepository.findByBranch(branch);
	// }
	public String deleteById(int id) {
		collegeRepository.deleteById(id);
		return "college deleted";
	}
	public List<College> getCollegeByName(String collegeName){
		return collegeRepository.findByCollegeName(collegeName);
		
		
	}
	
	

}