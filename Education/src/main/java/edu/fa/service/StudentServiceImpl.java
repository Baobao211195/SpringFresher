package edu.fa.service;

import java.util.List;

import edu.fa.model.Student;
import edu.fa.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	// setter injection
	private StudentRepository studentRepository ;
	

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	// setter injection
	// map with property in bean StudentService
	public void setStudentRepositorys(StudentRepository studentRepository) {
		System.out.println("Mapping with property in context.xml --> setter injection");
		this.studentRepository = studentRepository;
	}

	/* (non-Javadoc)
	 * @see edu.fa.service.StudentService#getAllStudent()
	 */
	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}
}
