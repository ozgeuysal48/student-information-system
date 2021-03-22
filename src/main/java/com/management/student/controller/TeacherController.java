package com.management.student.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.student.model.Teacher;
import com.management.student.services.TeacherService;

@RestController 
@RequestMapping("/api/teacher") 
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/{id}")
	public Teacher getTeacher(@PathVariable Long id){
		return teacherService.findById(id);
		
	}
	
	@GetMapping("/allTeachers")// service repotu kullandi. scontrolelr da sercisi kullanmali
	public List<Teacher> getAllTeachers(){
		return teacherService.findAllTeacher(); // we need a table in db 
	}
	
	
	
	@PostMapping("/saveTeacher")
	public String save(@RequestBody Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "Teacher is added!";
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable("id") long id) {
		try {
			if (id > 0) {
				if (teacherService.delete(id)) {
					return "Teacher is deleted";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "Failed to delete teacher";
	}

	@PutMapping("/updateTeacher")
	public String updateTeacher(@RequestBody Teacher teacher) {
		if (teacher != null) {
			teacherService.updateTeacher(teacher);
			return "Teacher is updated!";
		} else {
			return "Failed to update Teacher!!!";
		}
	}
	
}




// okç. controller servisi kullanir servis repoyu kullanir.
// ama suan teacher servis yok. student servis clasinin ismini genel bir isim olarka degistrebilriz
// o servis uzerinden birseyler kullanabilrizs. simdilik boyle olsun
// tum teacherlari getirecek methodu yazalim mi evett