package com.capDay8;
interface code{
	public void add(int a, int b);

}
interface Hell{
	public void first(String p);
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		code s= (a, b)->System.out.println(a+b);
		s.add(5,6);
		Hell x=p->System.out.println(p.substring(0,1));
		x.first("bindu");

	}

}
