package com.capgeminiDay2;
//single inheritence

/*class A{
	public void A() {
		System.out.println("Base class");
	}
}
class B extends A{
	public void B() {
		System.out.println("child");
	}
}

public class Inheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj =new B();
		obj.A();
		obj.B();

	}

}*/

//multilevel
/*class A{
	public void A() {
		System.out.println("Base class");
	}
}
class B extends A{
	public void B() {
		System.out.println("child");
	}
}
class C extends B{
	public void c() {
		System.out.println("sub class");
	}
}*/
//hierarchial 

class A{
	public void A() {
		System.out.println("Base class");
	}
}
class B extends A{
	public void B() {
		System.out.println("child");
	}
}
class C extends A{
	public void c() {
		System.out.println("sub class");
	}
}

public class Inheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj =new C();
		obj.A();
		obj.c();
		B o =new B();
		o.A();
		o.B();

	}

}
