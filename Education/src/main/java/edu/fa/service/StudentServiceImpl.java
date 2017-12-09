package edu.fa.service;

import java.util.List;

import edu.fa.model.Student;
import edu.fa.repository.StudentRepository;
import edu.fa.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepositoryImpl = new StudentRepositoryImpl();
	
	
	
	/* (non-Javadoc)
	 * @see edu.fa.service.StudentService#getAllStudent()
	 */
	public List<Student> getAllStudent() {
		return studentRepositoryImpl.getAllStudent();
	}
}
