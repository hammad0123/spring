package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Student;
@Repository
public class StudentDaoJdbcImpl implements  StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String CREATE_STUDENT="insert into Student(Roll_Number,Student_Name,Student_Score) values (?,?,?)";
	private static final String READ_STUDENT="select  * from student where Roll_number= ?";
	private static final String UPDATE_STUDENT="update student set student_name=? where roll_number=? ";
	
	@Override
	public int createStudent(Student student) {

		int result = jdbcTemplate.update(CREATE_STUDENT,student.getRollNumber(),student.getStudentName(),student.getStudentScore());
		return result;
	}

	@Override
	public Student readStudentByRollNumber(int rollNumber) {

		/*List<Student> students = jdbcTemplate.query(READ_STUDENT,new StudentRowMapper());*/
		Student result = jdbcTemplate.queryForObject(READ_STUDENT,new Object[]{rollNumber},new StudentRowMapper());
		
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updateStudentByRollNumber(Student student) {
		int result =  jdbcTemplate.update(UPDATE_STUDENT,student.getRollNumber(),student.getStudentName());
		return result;
	}
	
	

}
