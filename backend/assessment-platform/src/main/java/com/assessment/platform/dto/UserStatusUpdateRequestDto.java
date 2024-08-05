package com.assessment.platform.dto;

public class UserStatusUpdateRequestDto {

	private int userId;

	private String status;

	public int getUserId() {
		return userId;
	}

	public String getStatus() {
		return status;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
