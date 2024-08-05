package com.assessment.platform.dto;

import org.springframework.beans.BeanUtils;

import com.assessment.platform.entities.Address;
import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;

public class UserDto {

	private int id;

	private String firstName;

	private String lastName;

	private String emailId;

	private String phoneNo;

	private String role;

	private Address address;

	private Grade grade;

	private String status;

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getRole() {
		return role;
	}

	public Address getAddress() {
		return address;
	}

	public Grade getGrade() {
		return grade;
	}

	public String getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static UserDto toUserDtoEntity(User user) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user, userDto);
		return userDto;
	}

}
