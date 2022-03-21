package com.capDay7;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LLHasahSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <Integer> s = new LinkedHashSet <Integer>();
		s.add(10);
		s.add(40);
		s.add(20);
		s.add(20);
		System.out.println(s);
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
