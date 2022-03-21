import java.util.*;
public class array {

	public static void main(String[] args) {
		System.out.println("enter n value");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evensize=0,oddsize=0,j=0,k=0;
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		for(int i=0;i<=n-1;i++) {
			if(a[i]%2==0) {
				evensize++;
				
			}
			else
				oddsize++;
			}
			int even[]=new int[evensize];
			int odd[]=new int[oddsize];
		for(int i=0;i<=n-1;i++) {
			if(a[i]%2==0) {
				even[j++]=a[i];
			}
			else {
				odd[k++]=a[i];
	
			}
		}
		for(int i=0;i<evensize;i++) {
		System.out.println(even[i]);
		
	}
		for(int i=0;i<oddsize;i++) {
			System.out.println(odd[i]);
			
		}
}
}
