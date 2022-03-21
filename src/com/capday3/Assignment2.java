package com.capday3;
abstract interface Students{
	void brand();
	void price();
	void color();
}
abstract class TV implements Students{
	@Override public void brand() {
		System.out.println("TOSHIBA");
	}
	@Override public void price() {
		System.out.println("price is 750000");
	}
	
}
abstract class Car implements Students{
	@Override public void brand() {
		System.out.println("BMW");
	}
	@Override public void price() {
		System.out.println("price is 4000000");
	}
	
}
abstract class Laptop implements Students{
	@Override public void price() {
		System.out.println("80000");
		
	}

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
		
	}
}
class Mobile extends TV{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Black");
		
	}
	
	
}


public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		m.brand();
		m.color();
		m.price();
		

	}

}
