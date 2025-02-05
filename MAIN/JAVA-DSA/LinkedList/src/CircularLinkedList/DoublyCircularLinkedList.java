package CircularLinkedList;

import DoublyLinkedList.DoublyLinkedList.Node;

public class DoublyCircularLinkedList {

	public static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	Node head;
	Node tail;
	int count;
	public DoublyCircularLinkedList() {
		this.head=null;
		this.tail=null;
		this.count=0;
	}
	
	public void InsertAtTheBeginning(int data) {

		Node NewNode= new Node(data);
		if (head==null) {
			head=NewNode;
			tail=NewNode;
			tail.next=head;
			head.prev=tail;
			count++;
			
		} else {
			NewNode.next=head;
			head.prev=NewNode;
			head=NewNode;
			tail.next=head;
			head.prev=tail;
			count++;
		}
		
	}
	
	public void InsertAtEnd(int data) {
		Node NewNode= new Node(data);
		if (head==null) {
			head=NewNode;
			tail=NewNode;
		} else {
			NewNode.prev=tail;
			tail.next=NewNode;
			NewNode.next=null;
			tail=NewNode;
		}
		head.prev=tail;
		tail.next=head;
		count++;
	}
	
	public void DeleteFirst() {
		if (head==null) {
			System.out.println("List Is Empty.");
		} else {
			head=head.next;
			head.prev=tail;
			tail.next=head;
			count--;
		}
	}
	
	public void DeleteEnd() {
		if (head==null) {
			System.out.println("The List Is Empty");
			return;
			
		}else if (head.next==null) {
			head=null;
			count--;
			return;
		}else {
			tail=tail.prev;
			tail.next=head;
			count--;
		}
	}
	
	public void PrintListBackward() {
		if (head==null) {
			System.out.println("List Is Empty");
		} else {
			do {
				System.out.print(tail.data+" <- ");
				tail=tail.prev;
			}while (tail!=head.prev);
			
			System.out.println();
		}
	}
	
	public void search(int ele) {
		Node tempNode=head;
		boolean flag=false;
		 do{
			if (ele==tempNode.data) {
				flag=true;
				break;
			}else {
				tempNode=tempNode.next;
			}	
		}while (tempNode.next!=head);
		if (flag) {
			System.out.println("Element Is Found.  "+ele);
		} else {
			System.out.println("Element Is Not Found.");
		}
		
	}
	
	public void PrintList() {
		Node currNode=head;
		if (currNode==null) {
			System.out.println("List Is Empty.");
		} else {
			do {
				System.out.print(currNode.data+" -> ");
				currNode=currNode.next;
			}while (currNode!=head);
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		DoublyCircularLinkedList list5=new DoublyCircularLinkedList();
		list5.InsertAtTheBeginning(10);
		list5.InsertAtTheBeginning(20);
		list5.InsertAtTheBeginning(30);
		list5.InsertAtTheBeginning(40);
		list5.InsertAtEnd(50);
		list5.InsertAtEnd(60);
		list5.PrintList();
		list5.PrintListBackward();
		list5.DeleteFirst();
		list5.PrintList();
		list5.DeleteEnd();
		list5.PrintList();
		list5.search(10);

	}

}
