package com.management.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "java101grades")

public class Java101Grades {
	
	public Java101Grades() { }
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentid")
	public Long studentid;

	@OneToOne
	@MapsId
	@JoinColumn(name = "studentid")
	private Student student;

	@Column(name = "first_grade")
	public double first_grade;

	@Column(name = "second_grade")
	public double second_grade;
	
	@Column(name = "midterm")
	public double midterm;
	
	@Column(name = "final_grade")
	public double final_grade;

	public Java101Grades(long studentid, double first_grade, double second_grade, double midterm, double final_grade) {
		this.studentid = studentid;
		this.first_grade = first_grade;
		this.second_grade = second_grade;
		this.midterm = midterm;
		this.final_grade = final_grade;
	}

	public double getMidterm() {
		return midterm;
	}

	public void setMidterm(double midterm) {
		this.midterm = midterm;
	}

	public double getFinal_grade() {
		return final_grade;
	}

	public void setFinal_grade(double final_grade) {
		this.final_grade = final_grade;
	}

	public long getStudentid() {
		return studentid;
	}

	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}

	public double getFirst_grade() {
		return first_grade;
	}

	public void setFirst_grade(double first_grade) {
		this.first_grade = first_grade;
	}

	public double getSecond_grade() {
		return second_grade;
	}

	public void setSecond_grade(double second_grade) {
		this.second_grade = second_grade;
	}

}
