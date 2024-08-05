package com.assessment.platform.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.platform.entities.Course;
import com.assessment.platform.entities.Grade;
import com.assessment.platform.repositories.CourseRepository;
import com.assessment.platform.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(int courseId) {
		Optional<Course> optionalCourse = courseRepository.findById(courseId);

		if (optionalCourse.isPresent()) {
			return optionalCourse.get();
		} else {
			return null;
		}
	}

	@Override
	public List<Course> getAllCoursesByStatus(String status) {
		return courseRepository.findByStatus(status);
	}

	@Override
	public List<Course> getAllCoursesByGradeAndStatus(Grade grade, String status) {
		return courseRepository.findByGradeAndStatus(grade, status);
	}

}
