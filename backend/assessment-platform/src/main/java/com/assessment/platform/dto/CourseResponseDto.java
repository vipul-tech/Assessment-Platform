package com.assessment.platform.dto;


import java.util.ArrayList;
import java.util.List;

import com.assessment.platform.entities.CommonApiResponse;
import com.assessment.platform.entities.Course;

public class CourseResponseDto extends CommonApiResponse {

	private List<Course> courses = new ArrayList<>();

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
