package com.capday4;

class Add {
	public void sum(int a) {
		System.out.println("value of a is:" + a);
	}

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of and b:" + c);
	}

	 
}

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj = new Add();
		obj.sum(4);
		obj.sum(4, 6);

	}

}
