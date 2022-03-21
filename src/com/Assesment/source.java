package com.Assesment;
import java.util.*;
 class person1 {
	String name;
	String game;
	person1(String name,String game){
		this.name=name;
		this.game=game;
	}
}
	class finale{
		private static final int Win = 1;
		private static final int Loss = 0;
		person1 person;
		public finale(person1 p){
			this.person=p;
			
		}
		public String checkPerson( ) {
			String[] nameStr = this.person.name.split(" ");
			String[] gameStr = this.person.game.split(" ");
			if(nameStr.length==2) {
				if(Integer.parseInt(gameStr[0])<=9 && Integer.parseInt(gameStr[1])<=9)
					return "Person valid";
			}
			return "Failed";
			
		}
		public int numberOfTrophies( ) {
			String[] gameStr = this.person.game.split(" ");
			int count=0;
			if(gameStr.length==3) {
				int W =Integer.parseInt(gameStr[0]);
				int L =Integer.parseInt(gameStr[1]);
				String s = gameStr[2];
				for(int i=0;i<s.length();i++) {
					if(s.charAt(i) == 'w'){
						count += W;
					}
					if(s.charAt(i) == 'l'){
						count -= L;
					}
			}
		}
			return count;
	}
	}
	
	public class source{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc =new Scanner(System.in);
		//String name = sc.nextLine();
		//String game=sc.nextLine();
		person1 p = new person1("Ravi teja", "10 4 wl");
		finale f = new finale(p);
		System.out.println(f.checkPerson());
		System.out.println(f.numberOfTrophies());
		

	}

}