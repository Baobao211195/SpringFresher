package edu.fa;

import java.util.List;

import edu.fa.model.Student;
import edu.fa.service.StudentService;
import edu.fa.service.StudentServiceImpl;

public class EducationApp {
	
	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		
		
		List<Student> studentLst = studentService.getAllStudent();
		
		System.out.println(studentLst);
	}

}
