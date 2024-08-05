package com.assessment.platform.entities;


import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

public class StudentAnswerRequest {
	
    private List<Question> questions = new ArrayList<>();
    
    private int studentId;
    
    private int examId;

	public List<Question> getQuestions() {
		return questions;
	}

	public int getStudentId() {
		return studentId;
	}

	public int getExamId() {
		return examId;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public static boolean validate(StudentAnswerRequest request) {
        return request.getExamId() != 0 && request.getStudentId() != 0 &&
				!CollectionUtils.isEmpty(request.getQuestions());
    }
    
}
