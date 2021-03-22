package com.management.student.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.management.student.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> { 
	
	
	
	
}


