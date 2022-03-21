package com.capEmployeeManagementSystem;

import java.sql.Date;

//POJO
public class Employee implements Comparable <Employee>{

	// local variable
	private int id;
	private String name;
	private double salary;
	private String doj;

	//default constructor
	public Employee() {
	}

	// constructor with parameters
	public Employee(int id, String name, double salary, String doj) {

		this.id = id; 
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double sary) {
		salary = sary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	public int compareTo(Employee obj2) { 
		return this.getName().compareTo(obj2.getName());
		/*
		 * if(this.getId()>obj2.getId()) { return 1; } if(this.getId()<obj2.getId()) {
		 * return -1;} else { return 0; }
		 */
	}
	
	// toString method for printing
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}
}
