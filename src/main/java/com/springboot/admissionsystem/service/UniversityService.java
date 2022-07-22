package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.admissionsystem.entity.University;
import com.springboot.admissionsystem.repository.UniversityRepository;
@Service
public class UniversityService {
	@Autowired
	UniversityRepository universityRepository;
	public List<University> getAllUniversity(){
		return (List<University>) universityRepository.findAll();
		
	}
	public String addUniversity(University u) {
		universityRepository.save(u);
		return "University Added";
	}
	public String updateUniversityById(University university, int uid) {
		university.setUid(uid);
		universityRepository.save(university);
		return "University Updated";
	}
	public List<University> getUniversityByLocation(String location){
		return universityRepository.findByLocation(location);
	}
	public String deleteById(int uid) {
		universityRepository.deleteById(uid);
		return "university deleted";
	}
	public List<University> getUniversityByName(String university_name){
		return universityRepository.findByUniversity_name(university_name);
		
		
	}
	
	

}
