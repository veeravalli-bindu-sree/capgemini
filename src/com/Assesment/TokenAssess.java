package com.Assesment;
import java.util.*;
public class TokenAssess {
public static void main(String args[]) {
	TokenAssess obj = new TokenAssess();
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	
	System.out.println(obj.getSum(s));
	}

public static int getSum(String s) {
	// TODO Auto-generated method stub
	StringTokenizer st = new StringTokenizer(s," ");
	int sum=0;
	while(st.hasMoreTokens()) {
		String x = st.nextToken();
		int y =Integer.parseInt(x);
		
		sum=sum+y;
	}
	return sum;
	
}

}
