package com.capEmployeeManagementSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
	private int rno;
	private String name;
	private int grade;
	
	public Student(int rno, String name, int grade){
		this.rno=rno;
		this.name=name;
		this.grade=grade;
		
		
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", grade=" + grade + "]";
	}
	

public static void main(String a[]){
	Student list[]=new Student[10];
	int count=0;
	Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println("Enter Choice !");
		System.out.println("Press 1 for Add Student ");
		System.out.println("Press 2 for Create New Student List  ");
		System.out.println("Press 3 for Edit Student ");
		System.out.println("Press 4 for Print highest grade of the students ");
		System.out.println("Press 5 for Print minimum grade of the students ");
		//System.out.println("Press 6 for Print Sort the Salary of Employee ");
		System.out.println("Press 7 for Print Sort the Name of Employee ");
		System.out.println("Press 8 exit");
		System.out.println("Press 9 for Display the List");
		int choice = sc.nextInt();

		if (choice == 1) {
			
			System.out.println("Enter the Student rolno");
		    int id = sc.nextInt();
			
			// System.out.println("choice "+choice);
			System.out.println("Enter the student name");
			String name= sc.next();

			System.out.println("Enter the grade of the student");
			int grade = sc.nextInt();

			
			// taking the current date starts

			//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			//Date date = new Date();
			// System.out.println(dateFormat.format(date));
			// current date logic ends

			//String newdate = dateFormat.format(date);
			Student stu = new Student(id, name, grade);
			list[count] = stu;
			count = count + 1;

		}

		else if (choice == 8) {
			// contiune--which will run with next iteration and skip the current iteration
			// break will end the loop
			break;
		} else if (choice == 9) {

			for (Student s : list) {
				System.out.println(s);
			}
		} else {
			System.out.println("Wrong chocie try again");
		}

	}

}
	
	
}
