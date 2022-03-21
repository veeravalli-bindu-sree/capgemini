package com.capgeminiDay2;
class Employee{
	String name;
	double salary;
	int age;
	public Employee() {
		
	}
	//default constructor
	
	
	public Employee(String name, double salary,int age) {
		this.name=name;
		this.salary=salary;
		this.age=age;
		//System.out.println(age);
	}

//parameterized constructor

void printVal() {
	System.out.println(name);
	System.out.println(salary);
	System.out.println(age);
}
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name=name;
}

}

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("bindu",1000000,21);
		emp.printVal();
		emp.setName("charan");
		System.out.println("name "+emp.getName());

	}

}
