package com.lti.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Student;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student1 = (Student) context.getBean("student");
		
		Student student2= (Student) context.getBean("student");
		System.out.println(student1);
		System.out.println(student1.getAddress());
	}

}
