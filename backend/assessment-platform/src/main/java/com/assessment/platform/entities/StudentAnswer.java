package com.assessment.platform.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentAnswer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "exam_id")
	private Exam exam;

	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private User student; // Assuming User represents a student

	private int correctAnswer; // index of above array, and here we will store Answer which is given by Student

	private String submitDateTime;

	public int getId() {
		return id;
	}

	public Exam getExam() {
		return exam;
	}

	public Question getQuestion() {
		return question;
	}

	public User getStudent() {
		return student;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public String getSubmitDateTime() {
		return submitDateTime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public void setSubmitDateTime(String submitDateTime) {
		this.submitDateTime = submitDateTime;
	}

}
