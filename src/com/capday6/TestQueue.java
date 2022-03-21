package com.capday6;
//import the modules to access the collection methods 
import java.util.LinkedList;
import java.util.Queue;
public class TestQueue {

	public static void main(String[] args) {
		//create a queue object
		Queue<String> q = new LinkedList<>();
		//creat 
		Queue<String> q1 = new LinkedList<>();
		//add the string into the queue 
		q.add("this is a test of the queue class");
		//print the conent of the queue
		System.out.println("Content in the queue is "+q);
		//retrieve all elementsof the queue and storing in another queue called q1
		q1.addAll(q);
		System.out.println(q1);
		//comparing with the intial string
		boolean isEqual = q.equals(q1);
		System.out.println("Equal");

	}

}
