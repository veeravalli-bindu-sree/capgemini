package com.capday3;

abstract interface Employee{
	public void print();
}

class Company implements Employee{
	//@Override 
	public void print() {
		System.out.println("MEthod interface ex");
	}
}
class Dept{
	public void printDept() {
		System.out.println("dep");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com =new Company();
		Dept d= new Dept();
		d.printDept();
		com.print();
		

	}

}


