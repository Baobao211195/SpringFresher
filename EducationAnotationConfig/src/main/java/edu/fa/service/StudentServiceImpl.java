package edu.fa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.fa.model.Student;
import edu.fa.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	

	private StudentRepository studentRepository ;
	
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}
	
	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public StudentServiceImpl() {
	}

	/**
	 * @param studentRepository mapping with name of constructor-arg tag in bean
	 */
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		System.out.println("Contructor injection");
		this.studentRepository = studentRepository;
	}


	/* (non-Javadoc)
	 * @see edu.fa.service.StudentService#getAllStudent()
	 */
	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}
}
