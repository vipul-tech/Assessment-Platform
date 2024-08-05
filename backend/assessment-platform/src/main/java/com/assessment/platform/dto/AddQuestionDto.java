package com.assessment.platform.dto;

import org.springframework.beans.BeanUtils;

import com.assessment.platform.entities.Question;

public class AddQuestionDto {

	private String question;

	private String options; // ["1st","2nd","3rd","4th"]

	private int correctAnswer; // index of above array

	private double marks;

	private int examId;

	public String getQuestion() {
		return question;
	}

	public String getOptions() {
		return options;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public double getMarks() {
		return marks;
	}

	public int getExamId() {
		return examId;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public static Question toQuestionEntity(AddQuestionDto addQuestionDto) {
		Question question = new Question();
		BeanUtils.copyProperties(addQuestionDto, question, "examId");
		return question;
	}

	public static boolean validate(AddQuestionDto request) {

		if (request.getQuestion() == null || request.getOptions() == null || request.getMarks() == 0
				|| request.getExamId() == 0) {
			return false;
		}

		return true;

	}

}
