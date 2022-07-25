package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.admissionsystem.entity.Admission;
import com.springboot.admissionsystem.repository.AdmissionRepository;
@Service
public class AdmissionService {


	@Autowired
	static
	
	AdmissionRepository admissionRepository;
	public List<Admission> getAllAdmission(){
		return (List<Admission>) admissionRepository.findAll();
		
	}
	public String addAdmission(Admission f) {
		admissionRepository.save(f);
		return "firstName Added";
	}
	public String updateAdmissionById(Admission admission, int id) {
		admission.setId(id);
		admissionRepository.save(admission);
		return "Admission Updated";
	}
	public static List<Admission> getAdmissionByGender(String gender){
		return admissionRepository.findByGender(gender);
	}
	public String deleteById(int id) {
		admissionRepository.deleteById(id);
		return "admission deleted";
	}
	public List<Admission> getAdmissionByName(String firstName){
		return admissionRepository.findByfirstName(firstName);
		
		
	}
	
	

}