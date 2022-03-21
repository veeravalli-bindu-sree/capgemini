package com.capEmployeeManagementSystem;
import java.util.Scanner;
public class comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++)  
		{  
		//reading array elements from the user   
		a[i]=sc.nextInt();  
		}  
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			
			int tmp = 0;  
			if (a[i] <a[j])   
			{  
			tmp = a[i];  
			a[i] = a[j];  
			a[j] = tmp;  
			}  
			}
		}
		for(int i=0;i<5;i++) {
		System.out.print(a[i]);
		}
	}

}
