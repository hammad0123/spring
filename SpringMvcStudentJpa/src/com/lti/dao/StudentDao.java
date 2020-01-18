package com.lti.dao;

import java.util.List;

import com.lti.model.Student;

public interface StudentDao {

	public int createStudent(Student student);
	public Student readStudentByRollNumber(int rollNumber);

	public List<Student> findAllStudent();
	
}
