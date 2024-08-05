package com.assessment.platform.dto;

import org.springframework.beans.BeanUtils;

import com.assessment.platform.entities.User;

public class RegisterUserRequestDto {

	private String firstName;

	private String lastName;

	private String emailId;

	private String password;

	private String phoneNo;

	private String role;

	private String street;

	private String city;

	private int pincode;

	private int gradeId;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getRole() {
		return role;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public static User toUserEntity(RegisterUserRequestDto registerUserRequestDto) {
		User user = new User();
		BeanUtils.copyProperties(registerUserRequestDto, user);
		return user;
	}

}
