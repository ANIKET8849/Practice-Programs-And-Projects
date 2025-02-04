package Stackreverse;

import java.util.Scanner;

public class Stackreverse {

	char[] arr= new char[100];
	int top=-1;
	boolean Isempty() {
		if (top==-1) {
			return true;
		}
		return false;
	}
	boolean Isfull() {
		if (top==100) {
			return true;
		}
		return false;
	}
	void push(char v) {
		if (Isfull()) {
			System.out.println("Stack Is Full ");
		}
		arr[++top]=v;
		
		
	}
	char pop() {
		if (Isempty()) {
			System.out.println("Stack Is Empty : ");
		}
//		System.out.println("Item Removed Sucessfully ");
//		x=arr[top--];
//		System.out.print(arr[top--]);
		return arr[top--];
	}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
//		char arr2[]=new char[100];
		Stackreverse s= new Stackreverse();
		
		System.out.println("Enter The String : ");
		String str =in.nextLine();
		
//		arr2=str.toCharArray();
//		for(int i=0; i<arr2.length; i++) {
//			s.push(arr2[i]);
//		}
//		for(int i=0; i<arr2.length; i++) {
//			s.pop(arr2[i]);
//		}
		for(int i=0; i<str.length(); i++) {
			s.push(str.charAt(i));
		}
//		for(int i=0; i<str.length(); i++) {
//			System.out.print(s.pop());
//		}
		int i=0;
		while (!s.Isempty()) {
			System.out.print(s.pop());
			i++;
		}
		
	}
	
	
}
