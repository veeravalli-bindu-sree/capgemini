package com.capday4;
import java.util.*;

class BMI{
	float weight;
	float height;
	public static double bmiCalculator(float weight,float height){
		double BMI =weight/(height*height);
		return BMI;
		
	}

public static String bmiCategory ( double bmi ) {

if ( bmi <= 18.5 ) 
	return "underweight";

else if ( bmi < 25.0 && bmi>18.5  ) return "normal";

else if ( bmi < 30.0 && bmi >= 25.0) return "overweight";

else if ( bmi < 35.0 && bmi >= 30.0) return "obese";

else if ( 35 <= bmi ) return "very obese";

else return "invalid number";
}


	private static double BMI = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter height");
		float height =sc.nextFloat();
		System.out.println("enter weight");
		float weight = sc.nextFloat();
		BMI=bmiCalculator(weight,height);
		System.out.println("BMI value: "+BMI);
		System.out.println(bmiCategory( BMI));
		

	}
}
