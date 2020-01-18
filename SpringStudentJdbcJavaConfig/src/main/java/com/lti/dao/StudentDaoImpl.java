package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.lti.model.Student;

public class StudentDaoImpl implements StudentDao {

	private static List<Student> students;
	

	@Override
	public int createStudent(Student student) {
		boolean result=getStudents().add(student);
		if(result)
		return 1;
		else
			return 0;
	}

	@Override
	public Student readStudentByRollNumber(int rollNumber) {
		for(Student s :getStudents()){
			if(s.getRollNumber() == rollNumber){
				return s;
			}
		}
		
		return null;
	}

	public static List<Student> getStudents() {
		return students;
	}

	
	public static void setStudents(List<Student> students) {
		StudentDaoImpl.students = students;
	}

	@Override
	public int updateStudentByRollNumber(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
