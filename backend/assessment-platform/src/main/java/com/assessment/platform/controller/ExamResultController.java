package com.assessment.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.platform.entities.ExamResultResponse;
import com.assessment.platform.resource.ExamResultResource;

@RestController
@RequestMapping("api/exam/result")
@CrossOrigin(origins = "http://localhost:3000")
public class ExamResultController {
	
	@Autowired
	private ExamResultResource examResultResource;
	
	@GetMapping("/fetch/student-wise")
	// Api to fetch student exam student
	public ResponseEntity<ExamResultResponse> fetchStudentExamResult(@RequestParam("studentId") int studentId) {
		return examResultResource.fetchStudentExamResult(studentId);
	}
	
	@GetMapping("/fetch/grade-wise")
	// Api to fetch student exam results by grade id
	public ResponseEntity<ExamResultResponse> fetchStudentExamResultGradeWise(@RequestParam("gradeId") int gradeId) {
		return examResultResource.fetchStudentExamResultGradeWise(gradeId);
	}
	
	@GetMapping("/fetch/all")
	// Api to fetch student exam results
	public ResponseEntity<ExamResultResponse> fetchAllStudentResults() {
		return examResultResource.fetchAllStudentResults();
	}

}
