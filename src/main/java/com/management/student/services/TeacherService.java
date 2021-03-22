package com.management.student.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.management.student.model.Teacher;
import com.management.student.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;

	public List<Teacher> findAllTeacher() {
		return (List<Teacher>) teacherRepository.findAll();
	}

	public Teacher findById(Long id) {
		Optional<Teacher> result = teacherRepository.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}

	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public boolean delete(long id) {
		try {
			teacherRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateTeacher(Teacher teacher) {
		try {
			teacherRepository.save(teacher);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
