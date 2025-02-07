package com.assessment.platform.services;

import java.util.List;

import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;

public interface UserService {

	User addUser(User user);
	
	User updateUser(User user);

	User getUserByEmailAndStatus(String emailId, String status);

	User getUserByEmailid(String emailId);

	User findByRoleAndStatusIn(String emailId, List<String> status);

	List<User> getUserByRole(String role);
	
	User getUserById(int userId);
		
	User getUserByEmailIdAndRoleAndStatus(String emailId, String role, String status);
	
	List<User> updateAllUser(List<User> users);
	
	List<User> getUserByRoleAndStatus(String role, String status);
	
	List<User> getUsersByRoleAndGradeAndStatus(String role, Grade grade, String status);
	
}
