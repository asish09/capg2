package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.admissionsystem.entity.University;
import com.springboot.admissionsystem.repository.UniversityRepository;
@Service
public class UniversityService {
	@Autowired
	private UniversityRepository universityRepository;

	public List<University> getAllUniversity(){
		return (List<University>) universityRepository.findAll();
		
	}
	public String addUniversity(University university) {
		System.out.println(university.getUniversityName());
		universityRepository.save(university);
		return "University Added";
	}
	public String updateUniversityById(University university, int id) {
		university.setId(id);
		universityRepository.save(university);
		return "University Updated";
	}
	public List<University> getUniversityByLocation(String location){
		return universityRepository.getUniversityByLocation(location);
	}
	public String deleteById(int id) {
		universityRepository.deleteById(id);
		return "university deleted";
	}
	public List<University> getUniversityByUniversityName(String universityName){
		return universityRepository.getUniversityByUniversityName(universityName);
		
		
	}
	
	



}
