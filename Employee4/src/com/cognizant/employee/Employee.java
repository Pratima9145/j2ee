package com.cognizant.employee;

public class Employee {
	private String id;
	private String name;
	private String gender;
	private String date;
	private String fullTimeEmployee;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, String gender, String date, String fullTimeEmployee) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.fullTimeEmployee = fullTimeEmployee;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFullTimeEmployee() {
		return fullTimeEmployee;
	}

	public void setFullTimeEmployee(String fullTimeEmployee) {
		this.fullTimeEmployee = fullTimeEmployee;
	}

}
