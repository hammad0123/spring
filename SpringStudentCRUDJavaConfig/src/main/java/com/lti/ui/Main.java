package com.lti.ui;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.config.Appconfig;
import com.lti.model.Student;
import com.lti.services.StudentService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appcontext= new AnnotationConfigApplicationContext(Appconfig.class);
		
	    Student student= appcontext.getBean("student",Student.class);
	    
	    /*System.out.println(student);
	    System.out.println(student.getAddress());*/
		
		student.setRollNumber(40);
		student.setStudentName("krish");
		student.setStudentScore(99.87);
		student.getAddress().setAddressId(10);
		student.getAddress().setCity("hyderabad");
		student.getAddress().setPin("500001");
		
		StudentService service = appcontext.getBean("service",StudentService.class);
		boolean result=service.addStudent(student);
		
		if(result){
			System.out.println("student is added");
			Student student2 =service.findStudentByRollNumber(40);
			System.out.println(student);
			System.out.println(student2.getAddress());
			
		}
		else{
			
			System.out.println("student not added");
		}
		
		
	}

}
