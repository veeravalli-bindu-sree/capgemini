import java.util.*;

class LLNode{
	int data;
	LLNode next;
	
	LLNode(int a){
		data=a;
		next=null;
	
	}
}


public final class Linkedlist {
	
	

	public static void main(String[] args) {
		LLNode n = new LLNode(10);
		LLNode head =n;
		LLNode m= new LLNode(20);
		head.next=m;
		LLNode q = new LLNode(30);
		m.next=q;
		LLNode p = new LLNode(40);
		q.next=p;
		LLNode s= new LLNode(50);
		p.next=s;
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
		

}
