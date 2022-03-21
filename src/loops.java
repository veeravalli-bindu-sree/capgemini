import java.util.*;
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		
		 int a=sc.nextInt();
		 /*for(int i=1;i<=a;i++) { System.out.println(i); }
		 */
		
			/*
			 * int i=1; while(i<=a) { System.out.println(i); i+=1; }
			 */
		int i=1;
		do {
			System.out.println(i);
			i+=1;
		}while(i<=a);
		

	}

}
