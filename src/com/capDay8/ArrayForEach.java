package com.capDay8;
import java.util.ArrayList;
import java.util.function.Consumer;
public class ArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.forEach((Consumer<? super Integer>) new consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};

	}

}
