package CircularLinkedList;

public class SinglyCircularLinkedList {

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
	public SinglyCircularLinkedList() {
		this.head=null;
		this.count=0;
	}
	
	public void InsertAtBegin(int data) {
//		if (head.next.next==head) {
//			Node newnNode=new Node(data);
//			Node temp=head.next.next;
//			temp.next=newnNode;
//			newnNode.next=head;
//			temp=null;
//		} else {
//			Node newnNode=new Node(data);
//			Node temp =head.next;
//			while (temp!=head) {
//				temp=temp.next;
//			}
//			temp.next=newnNode;
//			newnNode.next=head;
//		}
		
		Node newnoNode=new Node(data);
		if (head==null) {
			head=newnoNode;
			newnoNode.next=head;
		} else {
			Node temp=head;
			while (temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newnoNode;
			newnoNode.next=head;
		}
		count++;
	}
	
	public void DeleteFirst() {
		if (head==null) {
			System.out.println("List Is Empty.");
		} else if (head.next==head) {
			head=null;
		}else {
			Node temp =head;
			while (temp.next!=head) {
				temp=temp.next;
			}
			head=head.next;
			temp.next=head;
		}
		
	}
	
	public void DeleteEnd() {
		if (head==null) {
			System.out.println("List Is Empty.");
		} else if (head.next==head) {
			head=null;
		}else {
			Node temp =head;
			while (temp.next.next!=head) {
				temp=temp.next;
			}
			temp.next=head;
		}
		
	}
	
	public void Printing() {
		Node currNode=head;
		if (head==null) {
			System.out.println("List Is Empty.");
		} else {
			do {
				System.out.print(currNode.data+" -> ");
				currNode=currNode.next;
			} while (currNode!=head);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SinglyCircularLinkedList list3 =new SinglyCircularLinkedList();
		list3.InsertAtBegin(10);
		list3.InsertAtBegin(20);
		list3.InsertAtBegin(30);
		list3.Printing();
		list3.DeleteFirst();
		list3.Printing();
		list3.DeleteEnd();
		list3.Printing();
	}

}
