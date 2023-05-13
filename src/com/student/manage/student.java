package com.student.manage;

public class student {
	private int studentID;
	private String studentName;
	private String studentPhone;
	private int studentAge;
	private String studentCity;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public student(int studentID, String studentName, String studentPhone, int studentAge, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
	}
	public student(String studentName, String studentPhone, int studentAge, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [studentID=" + studentID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentAge=" + studentAge + ", studentCity=" + studentCity + "]";
	}
	
	
	
}
