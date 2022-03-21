package com.capDay7;

import java.util.LinkedHashSet;

class Hash<I,S>{
	I id;
	S name;
	I cost;
	public Hash(I id,S name,I cost) {
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	
}

public class LinkedHashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Hash> h= new LinkedHashSet<Hash>();
		Hash h1 = new Hash(1,"java",1000);
		h.add(h1);
		for(Hash x:h){  
		    System.out.println(x.id+" "+x.name+" "+x.cost);  
		    }  

	}

}
