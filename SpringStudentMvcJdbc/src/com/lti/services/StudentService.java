package com.lti.services;

import java.util.List;

import com.lti.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public Student findStudentByRollNumber(int rollNumber);
	public int updateStudentByRollNumber(Student student);
	public List<Student> findAllStudent();
	

}
