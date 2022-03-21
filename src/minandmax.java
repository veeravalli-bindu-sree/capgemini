import java.util.*;
public class minandmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[]= {1,2,3}; for(int i=0;i<a.length;i++) { if(a[i]>a[i+1]) { int
		 * max=a[i]; }
		 * 
		 * }
		 */
		int Array[]= {7,9,2};
		int max = Array[0];
		for (int  i = 1; i < Array.length; i++) {
		  if (Array[i] > max) {
		    max = Array[i];
		  }
		}
		System.out.println(max);

		int min = Array[0];
		for (int i = 1; i < Array.length; i++) {
		  if (Array[i] < min) {
		    min = Array[i];
		  }
		}
		System.out.println(min);
	}

}
