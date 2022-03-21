package com.capEmployeeManagementSystem;
import java.util.*;
public class SortBy implements Comparator<Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId()) {
			return -1;
		}
		if(o1.getId()<o2.getId()) {
			return 1;
		}
		else {
		return 0;
	}

}
	
}