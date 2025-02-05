package Queue;

import java.util.Scanner;

import LinkedList.SinglyLinkedList2.Node;
import Stack.LinkedListAsStack;

public class LinkedListAsQueue {

	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head;
	LinkedListAsQueue(){
		this.head=null;
	}
	
	public void EnQueue(int data) {
		Node newNode=new Node(data);
		if (head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while (temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public void DeQueue() {
		if (IsEmpty()) {
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
	
	@SuppressWarnings("null")
	public void Peek() {
		if (IsEmpty()) {
			System.out.println("List Is Empty.");
		} else {
			Node currNode=head;
			while (currNode.next!=null) {
				currNode=currNode.next;
			}
			System.out.print(currNode.data+" -> ");
			System.out.println();
		}
	}
	
	public void DisplayQueue() {
		Node currNode=head;
		while (currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		LinkedListAsQueue listAsQueue =new LinkedListAsQueue();
		int opt;
		
		do {
			System.out.println("Singly Linked List Queue Menu");
			System.out.println("\n1.EnQueue  \n2.DeQueue \n3.Peek \n4.DisplayQueue \n5.Empty \n6.Exit");
			opt=inScanner.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter Data To Enter");
				int data=inScanner.nextInt();
				listAsQueue.EnQueue(data);
				break;
				
			case 2:
				listAsQueue.DeQueue();
				break;
				
			case 3:
				listAsQueue.Peek();
				break;
				
			case 4:
				listAsQueue.DisplayQueue();
				break;

			case 5:
				listAsQueue.IsEmpty();
				break;
			}
		}while(opt!=6);

	}

}
