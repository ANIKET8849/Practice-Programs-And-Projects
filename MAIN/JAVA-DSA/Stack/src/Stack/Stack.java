package Stack;

import java.util.Scanner;

public class Stack {
	int[] arr=new int[5];
	int top;

	
	boolean Isempty(){
		if(top==-1) {
			return true;
		}
		return false;
	}
	boolean Isfull() {
		if(top==4) {
			return true;
		}
		return false;
	}
	void push(int v) {
		if(Isfull()) {
			System.out.println("Stack Is Overflow ");
		}else {
			arr[++top]=v;
			System.out.println("Element Push Into Stack ");
		}
	}
	void peek() {
		if (Isempty()) {
			System.out.println("Stack Is Empty ");
		}
		System.out.println(arr[top]);
	}
	void fullarr() {
		if (Isempty()) {
			System.out.println("Stack Is Empty : ");
		}
		for(int i=0; i<=top; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	int pop() {
		if (Isempty()) {
			System.out.println("Stack Is UnderFlow ");
		}
		System.out.println("Element Is Remove Sucessfully !!! ");
		return (arr[top--]);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack s1 = new Stack();
		s1.top=-1;
		int opt = 0,n;
		do {
			System.out.println("Stack Menu !!! ");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.Full Array");
			System.out.println("5.Exit");
			
			System.out.println("Enter the Option ");
			opt=in.nextInt();
			
			switch (opt){
			case 1:
				System.out.println("Enter The Element To Add : ");
				n=in.nextInt();
				s1.push(n);
				break;
				
			case 2:
				s1.pop();
				break;
				
			case 3:
				s1.peek();
				break;
				
			case 4:
				s1.fullarr();
				break;
			}
		} while (opt!=5);
	}
}
