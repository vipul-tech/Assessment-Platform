package com.assessment.platform.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String addedDateTime;
	
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private User teacher;  // exam questions added by Role Teacher
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "grade_id")
	private Grade grade;
	
	private String startTime;
	
	private String endTime;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "exam_question_mapping",
        joinColumns = @JoinColumn(name = "exam_id"),
        inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private List<Question> questions = new ArrayList<>();
	
	private String status;
	
	@Transient
	private String message;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddedDateTime() {
		return addedDateTime;
	}

	public User getTeacher() {
		return teacher;
	}

	public Course getCourse() {
		return course;
	}

	public Grade getGrade() {
		return grade;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddedDateTime(String addedDateTime) {
		this.addedDateTime = addedDateTime;
	}

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
