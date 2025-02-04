package Queue;

import java.util.Scanner;

public class CircularQueue {
	private int[] arr;
	private int front=0,rear=-1,size=0;
	
	public void capacity(int cap) {
		arr=new int[cap];
	}
	
	public boolean Isempty() {
		if (rear==-1) {
			return true;
		}else {
			return false;
		}

	}
	
	public boolean IsFull() {
		if (rear==arr.length-1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void enque(int v) {
		if (IsFull()) {
			System.out.println("Queue Is Full : ");
		}else {
			arr[++rear]=v;
			System.out.println("Element Added Sucessfully : ");
			size++;
		}
	}
	public int dequeue() {
		if (Isempty()) {
			System.out.println("Queue Is Empty");
			front=0;
			rear=-1;
		}
		arr[front]=arr[front++];
		size--;
		return front;
	}
	public void peek() {
		if (Isempty()) {
			System.out.println("Stack Is Empty : ");
		}
		System.out.println("The Front Element Is : "+arr[front]);
		System.out.println("Size Of Array Is :"+size);
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		CircularQueue q=new CircularQueue();
		int opt,n;
		System.out.println("Enter Size Of Array You Want To Initialized : ");
		n=in.nextInt();
		q.capacity(n);
		do {
			
			System.out.println("\nQueue Operations : "+"\n\n1.Add Element In Queue : "+"\n2.Remove Element : "+"\n3.See The Front Element"+"\n4.Exit"+"\n\nEnter Your Choice : ");
			opt=in.nextInt();
			System.out.println();
			switch (opt) {	
			case 1:
				System.out.println("Enter The Element to Add in Queue : ");
				n=in.nextInt();
				q.enque(n);
				break;
				
			case 2:
				q.dequeue();
				break;
				
			case 3:
				q.peek();
				break;
				
			}
			
		} while (opt!=4);
	}
}


