class linkedlist{
Node head;

class Node{
String data;
Node next;

	Node(String data){
		this.data=data;
		this.next=null;
		}
	}

public void addfirst(String data){
	Node newnode=new Node(data);
	if(head==null){
			newnode=head;
			return;
		}
	newnode=head.next;
	}
		
public void addlast(String data){
		Node newnode=new Node(data);
			if(head==null){
				newnode = head;
		}
	Node currnode;
			currnode=head;
		while(currnode.next !=null){
			currnode=currnode.next;
			return;

			}
			currnode=newnode;	
	}


public void printlist(){
	while(head!=null){
	System.out.println(head.data+" -> ");
	return;
}
System.out.println("Null");
}


}
public static void main(String args[]){
	linkedlist list=new linkedlist();
	list.addfirst("hello");
	list.addlast("world");
	list.printlist();

}