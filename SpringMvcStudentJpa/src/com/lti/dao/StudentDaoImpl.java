package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
	private EntityManager entityManager;
	public StudentDaoImpl(){
		
	}

	@Override
	public int createStudent(Student student) {
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		return 1;
	}

	@Override
	public Student readStudentByRollNumber(int rollNumber) {

		return entityManager.find(Student.class, rollNumber);
	}

	

	@Override
	public List<Student> findAllStudent() {
		String jpql = "From Student";
		TypedQuery<Student> tquery = entityManager.createQuery(jpql,Student.class);
				
		return tquery.getResultList();
		
	}

}
