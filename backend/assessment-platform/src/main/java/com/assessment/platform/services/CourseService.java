package com.assessment.platform.services;


import java.util.List;

import com.assessment.platform.entities.Course;
import com.assessment.platform.entities.Grade;

public interface CourseService {
	
	Course addCourse(Course course);

	Course updateCourse(Course course);

	Course getCourseById(int courseId);

	List<Course> getAllCoursesByStatus(String status);
	
	List<Course> getAllCoursesByGradeAndStatus(Grade grade, String status);

}
