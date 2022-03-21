package com.capgeminiDay2;
/*class student{
	int rolno;
	String name;
	
	student(int rolno,String name){
		this.rolno=rolno;
		this.name=name;
		
	}
	void printVal() {
		System.out.println(rolno);
		System.out.println(name);
		
	}
}*/

/*class Pen{
	String color;
	int price;

	Pen(String color,int price){
		this.color=color;
		this.price=price;
}
	void printVal() {
		System.out.println(color);
		System.out.println(price);
		
	}
}	*/

/*
 * class Mouse{ String scroll; String click;
 * 
 * Mouse(String scroll,String click){ this.scroll=scroll; this.click=click; }
 * void printVal() { System.out.println(scroll); System.out.println(click);
 * 
 * } }
 */

/*class car{
	String color;
	int price;

	car(String color,int price){
		this.color=color;
		this.price=price;
}
	void printVal() {
		System.out.println(color);
		System.out.println(price);
		
	}
}	*/
//enter class name shd b always capital
class mobile{
	String color;
	int price;

	mobile(String color,int price){
		this.color=color;
		this.price=price;
}
	void printVal() {
		System.out.println(color);
		System.out.println(price);
		
	}
	public String getcolor() {
		return this.color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
}	


	
public class Assignment {
	public static void main(String a[]) {
		//student stu=new student(1,"bindu");
		//stu.printVal();
		//Mouse m=new Mouse("scroll down","click right");
		//m.printVal();
		//Pen m=new Pen("Black",500);
		//m.printVal();
		//car m=new car("Black",500000000);
		//m.printVal();
		mobile m=new mobile("Black",450000);
		//m.printVal();
		m.setcolor("Black");
		System.out.println("color "+m.getcolor());

	}
}
