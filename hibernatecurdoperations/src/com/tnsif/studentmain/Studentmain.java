package com.tnsif.studentmain;

import com.tnsif.model.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Studentmain {
	
	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		
		Student student=new Student();
		
		student.setSid(101);
		student.setSname("shyam");
		service.addStudent(student);
		
		System.out.println("data inserted");
	}

}
