package Stack;

import java.util.Scanner;

public class LinkedListAsStack {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head;
	LinkedListAsStack(){
		this.head=null;
	}
	
	public void Push(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void Pop() {
		if (head==null) {
			System.out.println("The List Is Empty");
			
		}else {
			head=head.next;
		}
	}
	
	boolean IsEmpty() {
		if (head==null) {
			System.out.println("List Is Empty.");
			return true;
		} else {
			return false;
		}
	}
	
	public void Peek() {
		if (IsEmpty()) {
			System.out.println("List Is Empty.");
		} else {
			System.out.println(head.data);
		}
	}
	
	public void DisplayStack() {
		Node currNode=head;
		while (currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		LinkedListAsStack listAsStack=new LinkedListAsStack();
		int opt;
		
		do {
			System.out.println("Singly Linked List Stack Menu");
			System.out.println("\n1.Push  \n2.Pop \n3.Peek \n4.DisplayStack \n5.Empty \n6.Exit");
			opt=inScanner.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter Data To Enter");
				int data=inScanner.nextInt();
				listAsStack.Push(data);
				break;
				
			case 2:
				listAsStack.Pop();
				break;
				
			case 3:
				listAsStack.Peek();
				break;
				
			case 4:
				listAsStack.DisplayStack();
				break;

			case 5:
				listAsStack.IsEmpty();
				break;
			}
		}while(opt!=6);

	}

}
