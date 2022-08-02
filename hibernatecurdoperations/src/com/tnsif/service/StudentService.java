package com.tnsif.service;

import com.tnsif.model.Student;

public interface StudentService {
	
	public abstract void addStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract Student findStudentById(int id);
	public abstract void removeStudent(Student student);

}
