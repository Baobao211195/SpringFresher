package edu.fa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.fa.service.StudentService;

public class EducationApp {
	
	public static void main(String[] args) {
		
		// load file context
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		// get Bean
		// look up name studentService in context.xml file 
		// StudentService.class is parent class with class="edu.fa.service.StudentServiceImpl" in context.xml
		StudentService service = context.getBean("studentService", StudentService.class);
		System.out.println(service.getAllStudent().size());
	}

}