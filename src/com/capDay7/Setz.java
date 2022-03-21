package com.capDay7;
import java.util.HashSet;
import java.util.Iterator;
public class Setz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(5);
		set.add(3);
		set.add(9);
		set.add(7);
		System.out.println(set);
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(set.size());
		System.out.println(set.toString());
		

	}

}
