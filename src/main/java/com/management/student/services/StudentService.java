package com.management.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.student.model.Result;
import com.management.student.model.Student;
import com.management.student.repository.InfoRepository;
import com.management.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private InfoRepository infoRepository;
	
	public Result findGradeById(long studentid) {
		return infoRepository.findGradeByStudentId(studentid);
	}

	public List<Student> findAllStudent(){
		return (List<Student>) studentRepository.findAll(); 
	}           
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student); 
	}
	
	public boolean update(Student student) {
		try {
		studentRepository.save(student);
		return true;
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
		 return false;
	 }
	}
	public boolean deleteById(long id) {
		try {
			studentRepository.deleteById(id);
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
}

