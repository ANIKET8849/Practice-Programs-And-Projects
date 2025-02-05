package LinkedList;

public class SinglyLinkedList{
		
		public static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				this.next=null;
			}
		}
		
		Node head;
		SinglyLinkedList(){
			this.head=null;
		}
		
		public void InsertAtTheBeginning(int data) {
			Node newNode=new Node(data);
			newNode.next=head;
			head=newNode;
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
		}
		
		public void DeleteFirst() {
			if (head==null) {
				System.out.println("The List Is Empty");
				
			}else {
				head=head.next;
			}
		}
		
		public void DeleteEnd() {
			if (head==null) {
				System.out.println("The List Is Empty");
				return;
				
			}else if (head.next==null) {
				head=null;
				return;
			}else {
				Node temp=head;
				
				while (temp.next.next!=null) {
					temp=temp.next;
				}
				temp.next=null;
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
			SinglyLinkedList list=new SinglyLinkedList();
			list.InsertAtTheBeginning(10);
			list.InsertAtTheBeginning(12);
			list.InsertAtTheBeginning(7);
			list.InsertAtEnd(6);
			list.PrintList();
			list.DeleteFirst();
			list.PrintList();
			list.DeleteEnd();
			list.PrintList();
			
		}
	}
	
	

