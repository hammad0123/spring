package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.model.Student;
import com.lti.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String homepage(){
		return "index";
	}
	@RequestMapping(path="addStudent.view", method=RequestMethod.GET)
	public String addStudentView()
	{
		
		return "addStudent";
				
	}
	
	
	@RequestMapping(path="addStudent.do", method=RequestMethod.POST)
	public String addStudent(Student student)
	{
		//not required to do next line
		//request.getParameter("roll_number");
		boolean result=service.addStudent(student);	
	
		if(result){
			return "redirect:findAllStudent.do";
			
		}else
		{
			return "error";
					
		}
	}

@RequestMapping(path="findAllStudent.do")
public String findAllStudent(Model model){
	
	List<Student> students= service.findAllStudent();
	model.addAttribute("students",students);
	return "viewAllStudent";
	
	
}
}
