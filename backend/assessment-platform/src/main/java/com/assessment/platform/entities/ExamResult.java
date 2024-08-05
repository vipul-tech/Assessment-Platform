package com.assessment.platform.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ExamResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int totalQuestions;

	private int totalWrongAnswers;

	private int totalCorrectAnswers;

	private double totalMarks;

	private double score; // Store the score achieved by the student

	private double percentage; // Store the percentage obtained

	private String resultStatus; // Pass, Failed

	@ManyToOne
	@JoinColumn(name = "exam_id")
	private Exam exam;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private User student;

	private String dateTime;
	
	public int getId() {
		return id;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public int getTotalWrongAnswers() {
		return totalWrongAnswers;
	}

	public int getTotalCorrectAnswers() {
		return totalCorrectAnswers;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getScore() {
		return score;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public Exam getExam() {
		return exam;
	}

	public User getStudent() {
		return student;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public void setTotalWrongAnswers(int totalWrongAnswers) {
		this.totalWrongAnswers = totalWrongAnswers;
	}

	public void setTotalCorrectAnswers(int totalCorrectAnswers) {
		this.totalCorrectAnswers = totalCorrectAnswers;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
