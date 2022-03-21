package com.capday3;
interface Student{
	void read();
	void write();
}

abstract class Student1 implements Student{
	@Override public void read(){
		System.out.println("method to read");
	}
	
}
class Student2 extends Student1{
	@Override public void write() {
		System.out.println("method to write");
	}
}

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 obj = new Student2();
		obj.read();
		obj.write();

	}

}
