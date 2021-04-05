package com.management.student.model;

public class Result {

	private String name;
	private String surname;
	private double firstGrade;
	private double secondGrade;
	private double midterm;
	private double final_grade;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getFirstGrade() {
		return firstGrade;
	}
	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}
	public double getSecondGrade() {
		return secondGrade;
	}
	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}
	public Result(String name, String surname, double firstGrade, double secondGrade, double midterm, double final_grade) {
		this.name = name;
		this.surname = surname;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.midterm = midterm;
		this.final_grade = final_grade;
		
	}
}
