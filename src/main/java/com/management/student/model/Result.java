package com.management.student.model;

public class Result {

	private String name;
	private String surname;
	private double firstGrade;
	private double secondGrade;
	
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
	public Result(String name, String surname, double firstGrade, double secondGrade) {
		this.name = name;
		this.surname = surname;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
	}
}
