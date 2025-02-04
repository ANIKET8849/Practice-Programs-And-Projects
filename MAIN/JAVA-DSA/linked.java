
class linked {

    Node head;

    class Node{
    String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head=newnode;
            return;
        }
        newnode.next = head;
        head=newnode;
    }

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head=newnode;
            return;
        }
        Node currnode = head;
        while(currnode.next!=null){
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    public void printlist() {
        Node currnode = head;
        if (head == null) {
            System.out.println("Null");
        }
        while (currnode != null) {
        System.out.println(currnode.data + " -> ");
        currnode=currnode.next;
        }
        System.out.println("Null");
    }


public static void main(String args[]){
        linked list=new linked();
        list.addfirst("hello");
        list.addlast("world");
        list.printlist();
    
    }
}
