package com.assessment.platform.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String question;

	private String options; // ["1st","2nd","3rd","4th"]

	@JsonIgnore
	private int correctAnswer; // index of above array

	private double marks;

	private String status;

	@JsonIgnore
	@ManyToMany(mappedBy = "questions")
	private List<Exam> exams = new ArrayList<>();

	@Transient
	private int answer;

	@Transient
	private int correctAns;

	public int getId() {
		return id;
	}

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

	public String getStatus() {
		return status;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public int getAnswer() {
		return answer;
	}

	public int getCorrectAns() {
		return correctAns;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setStatus(String status) {
		this.status = status;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public void setCorrectAns(int correctAns) {
		this.correctAns = correctAns;
	}

}
