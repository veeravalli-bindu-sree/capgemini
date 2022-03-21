package com.capday3;

class Employee1 {
	private String dept;
	private int Parking;
	private String Address;

	public Employee1(String dept, int parking, String Address) {
		this.dept = dept;
		this.Parking = parking;
		this.Address = Address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept1(String dept) {
		this.dept = dept;
	}

	public int getParking() {
		return Parking;
	}

	public void setParking(String parking, int Parking) {
		this.Parking = Parking;
	}

	public String getAddress() {
		return Address;
	}

	public void setDept(String Address) {
		this.Address = Address;
	}
	/*
	 * @Override public String toString() { return
	 * "Employee[dept="+dept+",parking="+ Parking+",Address="+Address+"}"; }
	 */

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1("IT", 4, "hyd");
		System.out.println(emp.getDept());
		System.out.println(emp.getParking());
		System.out.println(emp.getAddress());

	}

}
