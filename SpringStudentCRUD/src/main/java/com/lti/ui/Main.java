package com.lti.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Student;
import com.lti.services.StudentService;

public class Main {

	public static void main(String[] args) {

		/*ApplicationContext context = new FileSystemXmlApplicationContext("");*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		StudentService service=(StudentService) context.getBean("service");
		// You have to receive the data from the user if you want to store real data
		Student s1 = (Student) context.getBean("student");
		
		boolean result = service.addStudent(s1);
		if(result){
			System.out.println("Student is Added");
			Student s2 = service.findStudentByRollNumber(s1.getRollNumber());
			System.out.println(s2);
			System.out.println(s2.getAddress());
		}
		else
			System.out.println("Student is not Added");
	}

}
