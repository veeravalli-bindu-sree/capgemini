package com.capDay7;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;
public class Stackz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> list = new Stack <Integer>();
		Stack <String> list1 = new Stack <String>();
		Vector <Integer> l = new Vector<Integer>(); 
		list.push(1);
		list1.push("bindu");
		list.push(2);
		list.push(3);
		list1.push("veeravalli");
		System.out.println("elements are:"+list);
		System.out.println("elements are:"+list1);
		System.out.println("pop ele"+list.pop());
		System.out.println("stack"+list);
		System.out.println("pop ele"+list1.pop());
		System.out.println("stack"+list1);
		System.out.println(list.empty());
		System.out.println("peek ele"+list1.peek());
		System.out.println("search:"+list.search(2));
		
		
		System.out.println("Vector..............");
		System.out.println(l.add(5));
		l.add(0, 4);
		System.out.println(l);
		l.addAll(list);
		System.out.println(l);
		l.addElement(9);
		System.out.println(l.capacity());
		System.out.println(l.clone());
		System.out.println(l.contains(7));
		System.out.println(l.containsAll(list));
		 Enumeration enu = l.elements();
		  
	        System.out.println("The enumeration of values are:");
	  
	        // Displaying the Enumeration
	        while (enu.hasMoreElements()) {
	            System.out.println(enu.nextElement());
	        }
	        System.out.println(l.hashCode());
	        System.out.println(l.firstElement());
	        System.out.println(l.get(3));
	       
	}

}
