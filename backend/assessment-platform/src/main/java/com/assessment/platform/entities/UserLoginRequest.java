package com.assessment.platform.entities;

public class UserLoginRequest {

	private String emailId;

	private String password;

	private String role;

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
