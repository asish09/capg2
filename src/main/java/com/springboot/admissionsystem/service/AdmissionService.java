package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.admissionsystem.entity.Admission;
import com.springboot.admissionsystem.repository.AdmissionRepository;
@Service
public class AdmissionService {

	@Autowired
	AdmissionRepository admissionRepository;
	public List<Admission> getAllAdmission(){
		return (List<Admission>) admissionRepository.findAll();
		
	}
	public String addAdmission(Admission a) {
		admissionRepository.save(a);
		return "Admiision Done";
	}
	public String updateAdmissionById(Admission admission, int admissionnId) {
		admission.setAdmissionnId(admissionnId);
		admissionRepository.save(admission);
		return "Admission Updated";
	}
	public List<Admission> getAdmissionByCourse(String course){
		return admissionRepository.findByCourse(course);
	}
	public String deleteById(int admissionnId) {
		admissionRepository.deleteById(admissionnId);
		return "Admission deleted";
	}
	public List<Admission> getAdmissionByStudent(String student){
		return admissionRepository.findByStudent(student);
		
		
	}
	
	

}
