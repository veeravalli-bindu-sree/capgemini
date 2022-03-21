package com.capEmployeeManagementSystem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String newdate = dateFormat.format(date);
		List<Employee> ls = new ArrayList<Employee>();
		Employee x= new Employee(1,"alex",1000,newdate);
		Employee k= new Employee(8,"jack",2000,newdate);
		Employee t= new Employee(3,"nick",3000,newdate);
		Employee p= new Employee(9,"max",4000,newdate);
		ls.add(x);
		ls.add(k);
		ls.add(t);
		ls.add(p);
		SortBy byID = new SortBy();
		Collections.sort(ls,new SortBy());
		Collections.sort(ls);
		for(Employee e: ls){
			//System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+""+e.getDoj());
			System.out.println(e);
		}

	}

}
