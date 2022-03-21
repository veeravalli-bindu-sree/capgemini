package com.capday4;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		//try {
		int a = 10;
		int b = 0;
		String str=null;
		int z[]=new int[5];
		String s = "abc";
		FileInputStream fis =null;
		try {
			fis = new FileInputStream("/This PC/Desktop/lpy fea");
			//int i = Integer.parseInt(s);
			//z[6]=10;
			/*
			 * if(str.equals("gfd")) System.out.println("same"); else
			 * System.out.println("not same");
			 */
		// c = a / b;
		 //System.out.println(str.charAt(0));
		}
		catch(ArithmeticException e) {
			System.out.println("connot divide");
			System.out.println(c);
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExceptio Exception");
			
		}
		catch(NumberFormatException e) {
			System.out.println("NmberFormat Exception");
			
		}
	}

	private static void FileInputStream(String string) {
		// TODO Auto-generated method stub
		
	}

}
