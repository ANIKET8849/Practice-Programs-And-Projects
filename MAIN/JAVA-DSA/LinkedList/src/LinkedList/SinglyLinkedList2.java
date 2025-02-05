package LinkedList;

import java.util.Scanner;

public class SinglyLinkedList2{
		
		public static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				this.next=null;
			}
		}
		
		Node head;
		int count;
		SinglyLinkedList2(){
			this.head=null;
			this.count=0;
		}
		
		public void InsertAtTheBeginning(int data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
			count++;
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
			temp.next=newnoNode2;
			count++;
		}
		
		public void InsertAtEnd(int data) {
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
			count++;
		}
		
		public void DeleteAtBetween() {
			Scanner iScanner=new Scanner(System.in);
			System.out.println("Enter The Position To Delete : ");
			int pos=iScanner.nextInt();
			Node temp=head;
			for (int i = 1; i < pos-1; i++) {
				temp=temp.next;
			}
			Node t;
			t=temp.next;
			temp.next=t.next;
			t=null;
		}
		
		public void DeleteFirst() {
			if (count==0) {
				System.out.println("The List Is Empty");
				
			}else {
				head=head.next;
				count--;
			}
		}
		
		public void DeleteEnd() {
			if (count==0) {
				System.out.println("The List Is Empty");
				return;
				
			}else if (count==1) {
				head=null;
				count--;
				return;
			}else {
				Node temp=head;
				
				while (temp.next.next!=null) {
					temp=temp.next;
				}
				temp.next=null;
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
				System.out.println("Element Is Found.");
			} else {
				System.out.println("Please Enter Valid Element.");
			}
			
		}
		
		public void DisplayOne(int ele) {
			Node tempNode;
			tempNode=head;
			if (ele<=count) {
				for (int i = 0; i < ele; i++) {
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

		public static void main(String[] args) {
			Scanner inScanner=new Scanner(System.in);
			SinglyLinkedList2 list2=new SinglyLinkedList2();
//			list2.InsertAtTheBeginning(10);
//			list2.InsertAtTheBeginning(12);
//			list2.InsertAtTheBeginning(7);
//			list2.InsertAtEnd(6);
//			list2.PrintList();
//			list2.DeleteFirst();
//			list2.PrintList();
//			list2.DeleteEnd();
//			list2.PrintList();
			
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
							list2.InsertAtTheBeginning(ele);
							break;
							
						case 2:
							System.out.println("Enter The Element To Insert : ");
							int ele2=inScanner.nextInt();
							list2.InsertAtEnd(ele2);
							break;
							
						case 3:
							System.out.println("Enter The Element To Insert : ");
							int ele3=inScanner.nextInt();
							list2.InsertAtBetween(ele3);
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
							list2.DeleteFirst();
							break;
							
						case 2:
							list2.DeleteEnd();
							break;

						case 3:
							list2.DeleteAtBetween();
							break;
							
						case 4:
							break;
						}
					}while (ch2!=4);
					break;
					
				case 3:
					do{
						System.out.println("\n1.DisplaySingle \n2.DisplayAll \n3.Exit");
						ch3=inScanner.nextInt();
						switch (ch3) {
						case 1:
							System.out.println("Enter The Position To Display : ");
							int ele=inScanner.nextInt();
							list2.DisplayOne(ele);
							break;
							
						case 2:
							list2.PrintList();
							break;

						case 3:
							break;
						}
					}while (ch3!=3);
					break;
					
				case 4:
					do{
						System.out.println("\n1.Search \n2.Exit");
						ch4=inScanner.nextInt();
						switch (ch4) {
						case 1:
							System.out.println("Enter The Element To Search : ");
							int ele=inScanner.nextInt();
							list2.search(ele);
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
	
	

