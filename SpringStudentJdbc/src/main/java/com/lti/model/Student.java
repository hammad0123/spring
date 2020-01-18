package com.lti.model;

public class Student {

	public Student(int rollNumber, String studentName, double studentScore) {
		super();
		System.out.println("parameterised");
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	public Student() {

		super();
		System.out.println("default");
		
	}
	private int rollNumber;
	private String studentName;
	private double studentScore;
	private Address address;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
