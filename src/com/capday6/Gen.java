package com.capday6;
class Generic<T,N>{
	private T id;
	private N name;

	public Generic(T id,N name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public N getName() {
		return name;
	}

	public void setName(N name) {
		this.name = name;
	}
	public void print() {
		System.out.println("id "+id);
		System.out.println("name "+name);
	}
	
}
public class Gen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer,String> x= new Generic<Integer,String>(100,"Bindu");
x.print();
	}

}
