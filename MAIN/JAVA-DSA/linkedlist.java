

public class linkedlist {
    public Node head;
    private  int size;

    public linkedlist() {
        this.size=0;
        return;
    }
    

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add-first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add-last
    public void addlast(String data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            return;

        }
        Node currnode =head;
        while(currnode.next!=null){
            currnode=currnode.next;

        }
        currnode.next=newnode;

    }



    public void printlist(){
        Node currNode = head;
        if(head==null){
            System.out.println("List Is Empty");
        }
        while(currNode!=null){
            System.out.println(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("null\n\n");
    }

    //delete first
    public void deletefirst(){
        if(head==null){
            System.out.println("The List Is Empty ");
            return;
        }

        head=head.next;
        size--;
    }

    //delete last
    public void deletelast(){
      if(head==null){
        System.out.println("The List Is Empty ");
        return;
      }
      size--;

      if(head.next==null){
        head=null;
        return;
      }

      Node secondlast =head;
      Node lastNode=head.next;
      while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondlast=secondlast.next;

      }
      secondlast.next=null;


    }


    public int getsize(){
        return this.size;
    }




    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        int choice;
        System.out.println("Enter The Action You Want:  \n\n1.ADDING LAST NODE  \n2.ADD LAST NODE  \n3.DELETE FIRST NODE  \n4.DELETE LAST NODE \n5.PRINT LINKED LIST  \n6.PRINT SIZE OF LINKED LIST");
        

      
    }
}