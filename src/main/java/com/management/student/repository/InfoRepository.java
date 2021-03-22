package com.management.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.management.student.model.Result;
import com.management.student.model.Student;

@Repository
public interface InfoRepository extends JpaRepository<Student, Long>{
	@Query(value = "select new com.management.student.model.Result(s.student_name, s.student_surname, j.first_grade,j.second_grade) from Student as s "
			+ ",Java101Grades as j where (s.student_id = :studentid and j.studentid = :studentid)")
	public Result findGradeByStudentId(@Param("studentid") Long studentid);
}

// ctrl + y

// select s.student_name, s.student_surname, j.first_grade, j.second_grade from
//Student as s, Java101Grades as j where (s.student_id = 29 and j.studentid = 29)