package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControllerUpdate {
public static void main(String[] args) {
	Student student = new Student();
	student.setId(1);
	student.setName("Ankit");
	student.setEmail("Ankit@123");
	student.setGender("Male");
	student.setCno(1875286014);
	
	StudentDao studentDao =new StudentDao();
	studentDao.updateStudent(student);
	
}
}
