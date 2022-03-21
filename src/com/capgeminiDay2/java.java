package com.capgeminiDay2;
enum days{
	SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY,FRIDAY,SATURDAY
}

public class java {

	public static void main(String[] args) {
		//color str[]=color.values();
		// TODO Auto-generated method stub
		//to read one value from enum
		//color val=color.BLUE;
		//color.values();
		//System.out.println(color.RED);
		//for(color c:str) {
			//System.out.println(c);
		
		days str[]=days.values();
		for(days d:str) {
			System.out.println(d);
		}
		month s[]=month.values();
		for(month m:s) {
			System.out.println(m);
		}
		}
	}
enum month{
	JAN,FEB,MAR,APR,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC
}


