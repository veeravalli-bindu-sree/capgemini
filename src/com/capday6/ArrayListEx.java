package com.capday6;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list.add(30);
		list.add(50);
		list1.add(30);
		list1.add(100);
		System.out.println(list);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list.contains(30));
		System.out.println("Before sort");
		for(int x:list) {
			System.out.println(x);
		}
		Collections.sort(list);
		System.out.println("after sort");
		for(int x:list) {
			System.out.println(x);
		}
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("reverse"+list);


	}

}
