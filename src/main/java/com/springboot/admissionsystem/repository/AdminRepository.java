package com.springboot.admissionsystem.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springboot.admissionsystem.entity.Admin;
@Repository
public interface AdminRepository extends CrudRepository<Admin, String>{
	

}
