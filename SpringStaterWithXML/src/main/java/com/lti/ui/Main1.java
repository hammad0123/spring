package com.lti.ui;

import com.lti.model.Address;
import com.lti.model.Student;

public class Main1 {
public static void main(String[] args) {
	
	Student student=new Student(1,"rohan",60);
	
	Address address =new Address();
	
	address.setAddressId(10);
	address.setCity("mumbai");
	address.setPin("400507");
	
	student.setAddress(address);
	
	System.out.println(student);
	System.out.println(student.getAddress());
}
}
