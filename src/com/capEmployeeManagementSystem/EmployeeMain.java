package com.capEmployeeManagementSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		 
		Employee list[] = new Employee[10];

		int counter = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Choice !");
			System.out.println("Press 1 for Add Employee ");
			System.out.println("Press 2 for Create New Employee List  ");
			System.out.println("Press 3 for Edit Employee ");
			System.out.println("Press 4 for Print maximum Salary Employee ");
			System.out.println("Press 5 for Print minimum Salary Employee ");
			System.out.println("Press 6 for Print Sort the Salary of Employee ");
			System.out.println("Press 7 for Print Sort the Name of Employee ");
			System.out.println("Press 8 exit");
			System.out.println("Press 9 for Display the List");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("Enter the employee name");
				String name = sc.next();

				// System.out.println("choice "+choice);
				System.out.println("Enter the employee id");
				int id = sc.nextInt();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				// taking the current date starts

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				// System.out.println(dateFormat.format(date));
				// current date logic ends

				String newdate = dateFormat.format(date);
				Employee employee = new Employee(id, name, salary, newdate);
				list[counter] = employee;
				counter = counter + 1;

			}
			
			
			
			else if(choice==2) {
				Employee new_list[]=new Employee[10];        
				System.out.println("New employee Array is created");
			}
			
			
			
			
			
			

			 else if (choice == 3) {
				int count = 0;
				for (Employee e : list) {
					if (e != null) {
						System.out.println("press " + count + "" + e);
						count++;

					}
				}
				System.out.println("Enter employee index");
				int emp_index = sc.nextInt();

				System.out.println("press 1 for update Name");
				System.out.println("press 2 for update salary");
				System.out.println("press 3 for update id");
				int editChoice = sc.nextInt();
				switch (editChoice) {
				case 1:
					System.out.println("Enter Name");
					
					list[emp_index].setName(sc.next());
					break;

				case 2:
					System.out.println("Enter salary");
					list[emp_index].setSalary(sc.nextDouble());
					break;
				case 3:
					System.out.println("Enter id");
					list[emp_index].setId(sc.nextInt());
					break;

				}

			}
			// max of sal
			else if (choice == 4) {
				double temp = list[0].getSalary();
				for (Employee e : list) {
					if (e != null) {
					if (temp < e.getSalary()) {
						temp = e.getSalary();
					}
					}

				}
				System.out.println("max salary is:" + temp);

			}

			
			
			
			
			// min sal
			else if (choice == 5) {
				double temp = list[0].getSalary();
				for (Employee e : list) {
					if (e != null) {
					if (temp > e.getSalary()) {
						temp = e.getSalary();
					}
					}

				}
				System.out.println("min salary is:" + temp);

			} 
			
			
			
			
			
			
			else if (choice == 6) {
				int c=0;
				for(Employee e:list) {
					if (e != null) {
						c++;
					}
				}
				
				for(int i=0;i<c;i++) {
					for (int j=0;j<c;j++) {
						Employee t;
						if (list[i] != null  && list[j]!=null) {
						if(list[i].getSalary()>list[j].getSalary()) {
							t=list[i];
							list[i]=list[j];
							list[j]=t;
						}
						}
					
				}
				}
				
				
				for (Employee e : list) {
					if (e != null) {
					System.out.println(e);
				
					}}
			
			}
			
			
			
			

			else if (choice == 7) {
				int c=0;
				for(Employee e:list) {
					c++;
				}
				
				for(int i=0;i<c;i++) {
					for (int j=0;j<c;j++) {
						Employee t;
						if(list[i]!=null && list[j]!=null) {
						int p;
							p=list[i].getName().compareTo(list[j].getName());
							if(p==1) {
							t=list[i];
							list[i]=list[j];
							list[j]=t;
						}
						}
					}
					
				}
				for (Employee e : list) {
					if (e != null) {
					System.out.println(e);
				
					}}
			}
			
			
			
			
			
			
			
			else if (choice == 8) {
				break;
			}
			
			
			
			
			
			
			else if (choice == 9) {

				for (Employee e : list) {
					if (e != null) {
					System.out.println(e);
				
					}}
			}
			
			
			

			else {
				System.out.println("Wrong chocie try again");
			}

		}

	}

}
