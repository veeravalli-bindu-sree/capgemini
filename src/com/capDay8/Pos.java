package com.capDay8;
interface positive{
	public void posorneg(int a);
}
public class Pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		positive p = (a)->
				{
			if(a>0) {
				System.out.println("positive");
			}
			else {
				System.out.println("negative");
			}
			
		};
	
		p.posorneg(-8);

	}

}

