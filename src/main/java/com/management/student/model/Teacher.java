package com.management.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {

	@Id // bu bir id dedik
	@GeneratedValue(strategy = GenerationType.AUTO) // id yi otomatik olarak kendin uret sirayla dedik
	@Column(name = "department_id")
	public Long department_id;
	
	@Column(name = "teacher_name")
	public String teacher_name;

	@Column(name = "teacher_surname") 
	public String teacher_surname;

	@Column(name = "department")
	public String department;

	@Column(name = "email")
	public String email;

	@Column(name = "phone_number")
	public int phone_number;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getTeacher_surname() {
		return teacher_surname;
	}

	public void setTeacher_surname(String teacher_surname) {
		this.teacher_surname = teacher_surname;
	}

	public Long getDepartmentId() {
		return department_id;
	}

	public void setDepartmentId(Long department_id) {
		this.department_id = department_id;
	}
}
