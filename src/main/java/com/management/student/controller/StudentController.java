package com.management.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.student.model.Result;
import com.management.student.model.Student;
import com.management.student.services.StudentService;

@RestController 
@RequestMapping("/api/student") // localhost:port/api/student/
public class StudentController {

	@Autowired
	private StudentService studentService; 
	
	@GetMapping("/findGrade/{id}")
	public Result findGradeById(@PathVariable ("id") long studentid) {
		return studentService.findGradeById(studentid);
	}
	
	@GetMapping("/findAll")
	public List<Student> getAllStudent(){
		List<Student> s = studentService.findAllStudent();
		return 	s;
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Student student)  {
		studentService.saveStudent(student);
		return "Student is added";
	}
	
	@PutMapping("/update")
	public String updateStudent(@RequestBody Student student) {
		if(student != null) {
		studentService.update(student);
		return "Student is updated!";
		}else {
			return "Failed to update Student!!!";
		}
	}
	
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable ("id") long id) {
		if(id > 0) {
			studentService.deleteById(id);
			return "Student is deleted!";
		}else {
			return "Failed to delete Student!!!";
		}
	}
}
