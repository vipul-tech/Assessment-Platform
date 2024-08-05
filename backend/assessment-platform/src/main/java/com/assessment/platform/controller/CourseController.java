package com.assessment.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.platform.dto.CourseResponseDto;
import com.assessment.platform.entities.AddCourseRequest;
import com.assessment.platform.entities.CommonApiResponse;
import com.assessment.platform.resource.CourseResource;

@RestController
@RequestMapping("api/course")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

	@Autowired
	private CourseResource courseResource;

	@PostMapping("/add")
	// Api to add course
	public ResponseEntity<CommonApiResponse> addCourse(@RequestBody AddCourseRequest request) {
		return courseResource.addCourse(request);
	}

	@PutMapping("/update")
	// Api to update course
	public ResponseEntity<CommonApiResponse> updateCourse(@RequestBody AddCourseRequest course) {
		return courseResource.updateCourse(course);
	}

	@GetMapping("/fetch/all")
	// Api to fetch all course
	public ResponseEntity<CourseResponseDto> fetchAllCourse() {
		return courseResource.fetchAllCourse();
	}

	@GetMapping("/fetch/all/grade-wise")
	// Api to fetch all course by grades
	public ResponseEntity<CourseResponseDto> fetchAllCoursebyGrade(@RequestParam("gradeId") int gradeId) {
		return courseResource.fetchAllCourseByGrade(gradeId);
	}
	
	@GetMapping("/fetch/id")
	// Api to fetch all course by grades
	public ResponseEntity<CourseResponseDto> fetchCourseById(@RequestParam("courseId") int courseId) {
		return courseResource.fetchCourseById(courseId);
	}

	@DeleteMapping("/delete")
	// Api to delete course
	public ResponseEntity<CommonApiResponse> deleteCourse(@RequestParam("courseId") int courseId) {
		return courseResource.deleteCourse(courseId);
	}
	
}
