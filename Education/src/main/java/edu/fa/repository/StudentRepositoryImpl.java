package edu.fa.repository;

import java.util.ArrayList;
import java.util.List;

import edu.fa.model.Student;

public class StudentRepositoryImpl implements StudentRepository{
	
	/**
	 * @return list of student
	 */
	public List<Student> getAllStudent() {
		List<Student> studentLst = new ArrayList<Student>();
		studentLst.add(new Student("oanh", "ha Nam"));
		studentLst.add(new Student("vankem", "Thai Binh"));
		return studentLst;
	}

}
