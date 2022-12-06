package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentControllerDelete {
public static void main(String[] args) {
	Student student = new Student();
	student.setId(9);
	student.setName("NITISH");
	student.setEmail("nitish@123");
	student.setGender("Male");
	student.setCno(1875286014);
	
	StudentDao studentDaoDelete = new StudentDao();
    studentDaoDelete.deleteStudent(student);
}
}
