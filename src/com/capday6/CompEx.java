package com.capday6;
import java.util.*;
class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	
	

	public Student(int id, String name, int age) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.age=age;
	}

	
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getId()>o.getId()) {
			return 1;
		}
		if(this.getId()<o.getId()) {
			return -1;}
		else {
			return 0;
		
	
	}
}

public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

public class CompEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student(1,"bindu",10));
		stu.add(new Student(2,"jessie",50));
		stu.add(new Student(3,"paul",10));
		Collections.sort(stu);
		for (Student s: stu)
        {
            System.out.println(s.getId() + " " +
                               s.getName() + " " +
                               s.getAge());
        }
	}
}
}
