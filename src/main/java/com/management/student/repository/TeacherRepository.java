package com.management.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.management.student.model.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher,Long> { // burada long olarak id istiyordu

}
