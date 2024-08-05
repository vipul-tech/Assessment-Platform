package com.assessment.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.platform.dto.QuestionsResponseDto;
import com.assessment.platform.entities.StudentAnswerRequest;
import com.assessment.platform.resource.StudentAnswerResource;

@RestController
@RequestMapping("api/student/answer")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentAnswerController {
	
	@Autowired
	private StudentAnswerResource studentAnswerResource;
	
	@PostMapping("/add")
	// Api to add student answers
	public ResponseEntity<QuestionsResponseDto> addExamQuestion(@RequestBody StudentAnswerRequest request) {
		return studentAnswerResource.addStudentAnswers(request);
	}

}
