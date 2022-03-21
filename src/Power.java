//importing the package to scan and take input
import java.util.*;
public class Power {
	//passing the parameters into the powerSet method
		static String powerSet(String str,int index,String curr) {
		int n= str.length();
		//if checks whether the length of string is equal to index if they are equeal prints the string
		if(index==n) {
			System.out.print("{"+curr+"}");
			return "";
		}
		//if the string is not equal to index it increments index and append that new character also.
		powerSet(str,index+1,curr+str.charAt(index));
		return powerSet(str,index +1,curr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str = "";
		System.out.println("How many elements are there in the set?");
	    int m = sc.nextInt();
	    System.out.println("Please enter the elements in the set:");
	  //loop to take the input
	    for(int i=0;i<m;i++){
//appending the characters and storing into str
		 str =str+ sc.next();}
			int index = 0;
			String curr="";
			System.out.print("The following is the power set of "+"{"+str+"}"+": ");
			//function call

			String res = powerSet(str,index,curr).replace(" ", ",");
			//System.out.print("result is "+res);
//System.out.print("The following is the power set of "+"{"+str+"}"+": ");
			
		
	}
}

