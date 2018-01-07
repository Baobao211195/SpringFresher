package edu.fa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.fa.service.StudentService;

public class EducationApp {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		StudentService service = context.getBean("studentService", StudentService.class);
		
		System.out.println(service.getAllStudent().get(0).getName());
	}

}