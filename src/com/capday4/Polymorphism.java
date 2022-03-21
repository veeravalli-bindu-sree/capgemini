package com.capday4;
class Person{
	public void print() {
		System.out.println("employee");
	}
}
class Office extends Person{
	@Override
	public void print() {
		System.out.println("colligue");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1 = new Person();
		obj1.print();
		Person obj = new Office();
		obj.print();

	}

}
