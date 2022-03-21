package com.capDay7;
import java.util.Spliterator;
import java.util.TreeSet;
public class Treez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <String> obj = new TreeSet<String>();
		TreeSet <Integer> obj1 = new TreeSet<Integer>();

		obj.add("Bindu");
		obj.add("abc");
		obj.add("xyz");
		System.out.println(obj);
		
		obj1.add(8);
		obj1.add(1);
		obj1.add(9);
		System.out.println(obj1);
		
		System.out.println(obj.ceiling("a"));
		
		
		System.out.println(obj.equals(obj1));
		
		System.out.println(obj1.size());
		
		
		for (String xyz : obj) {    
            System.out.print(xyz);    
        }  
       Spliterator<String> obj11 = obj.spliterator();  
   System.out.println("Elements of TreeSet after using spliterator() method: ");  
  obj11.forEachRemaining(System.out::println);     
          
        

		

	}

}
