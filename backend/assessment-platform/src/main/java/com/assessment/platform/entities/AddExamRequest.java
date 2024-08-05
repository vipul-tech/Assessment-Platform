package com.assessment.platform.entities;

public class AddExamRequest {

	private int id;

	private String name;

	private int teacherId;

	private int courseId;

	private int gradeId;

	private String startTime;

	private String endTime;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public int getCourseId() {
		return courseId;
	}

	public int getGradeId() {
		return gradeId;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public static boolean validate(AddExamRequest request) {

		if (request.getName() == null || request.getTeacherId() == 0 || request.getCourseId() == 0
				|| request.getGradeId() == 0 || request.getStartTime() == null || request.getEndTime() == null) {
			return false;
		}

		return true;

	}

}
