package com.assessment.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmailId(String email);

	User findByEmailIdAndStatus(String email, String status);

	User findByRoleAndStatusIn(String role, List<String> status);

	List<User> findByRole(String role);
	
	User findByEmailIdAndRoleAndStatus(String emailId, String role, String status);
	
	List<User> findByRoleAndStatus(String role, String status);
	
	List<User> findByRoleAndGradeAndStatus(String role, Grade grade, String status);

}
