package edu.fa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Student;
import edu.fa.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository ;
	
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}
	
	
	public void setStudentRepository(StudentRepository studentRepository) {
		System.out.println("Setter injection");
		this.studentRepository = studentRepository;
	}

	public StudentServiceImpl() {
		super();
		System.out.println("Contrutor default");
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
