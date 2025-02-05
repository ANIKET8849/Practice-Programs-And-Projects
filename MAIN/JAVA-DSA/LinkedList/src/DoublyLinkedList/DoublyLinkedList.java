package DoublyLinkedList;

import java.util.Scanner;

import LinkedList.SinglyLinkedList2.Node;

public class DoublyLinkedList {

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
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.count=0;
	}
	
	public void InsertAtTheBeginning(int data) {

		Node NewNode= new Node(data);
		if (head==null) {
			head=NewNode;
			tail=NewNode;
			count++;
			
		} else {
			NewNode.next=head;
			head.prev=NewNode;
			head=NewNode;
			count++;
		}
		
	}
	
	public void InsertAtBetween(int data) {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Position To Insert : ");
		int pos=iScanner.nextInt();
		Node temp=head;
		for (int i = 1; i < pos-1; i++) {
			temp=temp.next;
		}
		Node newnoNode2=new Node(data);
		newnoNode2.next=temp.next;
		newnoNode2.prev=temp;
		newnoNode2.next.prev=newnoNode2;
		temp.next=newnoNode2;
		count++;
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
		count++;
	}
	
	public void DeleteFirst() {
		if (head==null) {
			System.out.println("List Is Empty.");
		} else {
			head=head.next;
			head.prev=null;
			count--;
		}
	}
	
	public void DeleteAtBetween() {
		Scanner iScanner=new Scanner(System.in);
		System.out.println("Enter The Position To Delete : ");
		int pos=iScanner.nextInt();
		Node temp=head;
		for (int i = 1; i < pos-1; i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp.next.prev=temp;
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
			tail.next=null;
			count--;
		}
	}
	
	public void search(int ele) {
		Node tempNode=head;
		boolean flag=false;
		while (tempNode.next!=null) {
			if (ele==tempNode.data) {
				flag=true;
				break;
			}else {
				tempNode=tempNode.next;
			}	
		}
		if (flag) {
			System.out.println("Element Is Found.  "+ele);
		} else {
			System.out.println("Element Is Not Found.");
		}
		
	}
	
	public void DisplayOne(int ele) {
		Node tempNode;
		tempNode=head;
		if (ele<=count) {
			for (int i = 0; i < ele-1; i++) {
				tempNode=tempNode.next;
			}
			System.out.println(tempNode.data);
		} else {
			System.out.println("Enter Valid Position.");
		}
		
	}
	
	public void PrintList() {
		Node currNode=head;
		while (currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		
		System.out.println();
	}
	
	public void PrintListBackward() {
		while (tail!=null) {
			System.out.print(tail.data+" <- ");
			tail=tail.prev;
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		DoublyLinkedList list =new DoublyLinkedList();
//		list.InsertAtTheBeginning(10);
//		list.InsertAtTheBeginning(20);
//		list.InsertAtTheBeginning(30);
//		list.InsertAtTheBeginning(40);
//		list.InsertAtTheBeginning(50);
//		list.InsertAtEnd(60);
//		list.InsertAtEnd(70);
//		list.InsertAtEnd(80);
//		list.PrintList();
//		list.DeleteFirst();
//		list.PrintList();
//		list.DeleteEnd();
//		list.PrintList();
//		list.search(10);
//		list.DisplayOne(4);
//		list.InsertAtBetween(90);
//		list.PrintList();
//		list.PrintListBackward();
		
		
		int opt,ch,ch2,ch3,ch4;
		
		do {
			System.out.println("Singly Linked List Menu");
			System.out.println("\n1.Insert  \n2.Delete \n3.Display \n4.Search \n5.Exit");
			opt=inScanner.nextInt();
			switch (opt) {
			case 1:
				do{
					System.out.println("\n1.InsertAtBegining \n2.InsertAtEnd \n3.InsertAtBetween \n4.Exit");
					ch=inScanner.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter The Element To Insert : ");
						int ele=inScanner.nextInt();
						list.InsertAtTheBeginning(ele);
						break;
						
					case 2:
						System.out.println("Enter The Element To Insert : ");
						int ele2=inScanner.nextInt();
						list.InsertAtEnd(ele2);
						break;
						
					case 3:
						System.out.println("Enter The Element To Insert : ");
						int ele3=inScanner.nextInt();
						list.InsertAtBetween(ele3);
						break;

					case 4:
						break;
					}
				}while(ch!=4);
				break;
				
			case 2:
				do {
					System.out.println("\n1.DeleteAtBegining \n2.DeleteAtEnd \n3.DeleteAtBetween \n4.Exit");
					ch2=inScanner.nextInt();
					switch (ch2) {
					case 1:
						list.DeleteFirst();
						break;
						
					case 2:
						list.DeleteEnd();
						break;

					case 3:
						list.DeleteAtBetween();
						break;
						
					case 4:
						break;
					}
				}while (ch2!=4);
				break;
				
			case 3:
				do{
					System.out.println("\n1.DisplaySingle \n2.DisplayAll \n3.Displaybackward \n4.Exit");
					ch3=inScanner.nextInt();
					switch (ch3) {
					case 1:
						System.out.println("Enter The Position To Display : ");
						int ele=inScanner.nextInt();
						list.DisplayOne(ele);;
						break;
						
					case 2:
						list.PrintList();
						break;

					case 3:
						list.PrintListBackward();
						break;
						
					case 4:
						break;
					}
				}while (ch3!=4);
				break;
				
			case 4:
				do{
					System.out.println("\n1.Search \n2.Exit");
					ch4=inScanner.nextInt();
					switch (ch4) {
					case 1:
						System.out.println("Enter The Element To Search : ");
						int ele=inScanner.nextInt();
						list.search(ele);
						break;
						
					case 2:
						break;
					}
				}while (ch4!=2);
				break;

			case 5:
				break;
			}
		}while(opt!=5);

	}

}
