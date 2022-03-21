package com.capDay8;
import java.util.*;
interface Even{
	public void even(int a);
}
interface Num{
	public void num(int t);
}
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		Even e = b->{
			if(a%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		
		};
		Even d =c->{
			System.out.println(a*a*a);
		};
		Num x=t->{ 
		while(t<=10){
			System.out.println(t++);
		};
		e.even(a);
		d.even(a);
		x.num(1);

		};
	
	}
}
