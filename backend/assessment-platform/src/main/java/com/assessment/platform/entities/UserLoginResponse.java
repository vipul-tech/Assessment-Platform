package com.assessment.platform.entities;

import com.assessment.platform.dto.UserDto;

public class UserLoginResponse extends CommonApiResponse {

	private UserDto user;

	private String jwtToken;

	public UserDto getUser() {
		return user;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

}
