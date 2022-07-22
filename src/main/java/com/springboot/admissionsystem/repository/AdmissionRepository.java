package com.springboot.admissionsystem.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springboot.admissionsystem.entity.Admission;
@Repository
public interface AdmissionRepository extends CrudRepository<Admission, Integer>{
	List<Admission> findByCourse(String course);
	List<Admission> findByStudent(String student);
	
}



