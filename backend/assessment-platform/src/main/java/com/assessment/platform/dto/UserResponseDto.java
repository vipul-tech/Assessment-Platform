package com.assessment.platform.dto;

import java.util.ArrayList;
import java.util.List;

import com.assessment.platform.entities.CommonApiResponse;

public class UserResponseDto extends CommonApiResponse {

	private List<UserDto> users = new ArrayList<>();

	public List<UserDto> getUsers() {
		return users;
	}

	public void setUsers(List<UserDto> users) {
		this.users = users;
	}

}
