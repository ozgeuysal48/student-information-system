package com.management.student.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentid")
	public Long studentid;	
	
	  @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	    @PrimaryKeyJoinColumn
	    private Java101Grades java101grades;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "date_of_birth", columnDefinition = "DATE")
	private Date date_of_birth;

	@Column(name = "student_name")
	public String student_name;
	
	@Column(name = "student_surname")
	public String student_surname;
	
	@Column(name = "email")
	public String email;
	
	@Column(name = "phone_number")
	public Long phone_number;
	
	@Column(name = "courses")
	public String courses;
	
	
	public Student() {}

	public Student(Date date_of_birth, Long studentid, String student_name, String student_surname, String email,
			Long phone_number, String courses) {
		this.date_of_birth = date_of_birth;
		this.studentid = studentid;
		this.student_name = student_name;
		this.student_surname = student_surname;
		this.email = email;
		this.phone_number = phone_number;
		this.courses = courses;
		
		
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public long getStudentId() {
		return studentid;
	}

	public void setStudentId(long studentid) {
		this.studentid = studentid;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_surname() {
		return student_surname;
	}

	public void setStudent_surname(String student_surname) {
		this.student_surname = student_surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getCourses() {
		return courses;
	}
	
	public void setCourses(String courses) {
		this.courses = courses;
	}
	
}
	
	
	
	
	
	

