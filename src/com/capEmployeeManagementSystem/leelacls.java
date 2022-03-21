package com.capEmployeeManagementSystem;

public class leelacls {
	
	private int a;
	private double b;
	private String c;
	leelacls(int a,double b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void setAge(int bind){
		this.a=bind;
	}
	int getAge() {
		return this.a;
	}
	void setSal(double bind){
		this.b=bind;
	}
	double getAsal() {
		return this.b;
	}
	void setname(String bind){
		this.c=bind;
	}
	String getname() {
		return this.c;
	}

	public static void main(String[] args) {
		int a[]=new int[20];
		leelacls arr[]=new leelacls[10];
		arr[4].setAge(10);
		arr[4].setname("bindu");
//		leelacls n=new leelacls(5,5.4,"leela");
//		System.out.println(n.a+" "+ n.b+ " "+n.c);
//		n.setAge(20);
		
		System.out.println(arr[4].getAge());
		System.out.println(arr[4].getname());
		
	}

}
