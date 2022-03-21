package com.capday6;
import java.util.*;
public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> list = new LinkedList<Integer>();
		list.add(20);
		list.addFirst(10);
		list.addLast(30);
		System.out.println(list.subList(0, 2));
		System.out.println(list);
		System.out.println(list.contains(8));
		System.out.println(list.indexOf(5));
		list.remove(0);
		for(int obj:list) {
			System.out.println(obj);
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
