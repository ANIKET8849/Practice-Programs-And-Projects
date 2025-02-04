package Validpar;

import java.util.Scanner;

public class Validpar {

	char[] arr=new char[100];
	int top=-1;

	
	boolean Isempty(){
		if(top==-1) {
			return true;
		}
		return false;
	}
	boolean Isfull() {
		if(top==99) {
			return true;
		}
		return false;
	}
	void push(char v) {
		if(Isfull()) {
			System.out.println("Stack Is Overflow ");
		}else {
			arr[++top]=v;
			
		}
	}
	void peek() {
		if (Isempty()) {
			System.out.println("Stack Is Empty ");
			return;
		}
		System.out.println(arr[top]);
	}

	char pop() {
		if (Isempty()) {
			System.out.println("Stack Is UnderFlow ");
		}
		return (arr[top--]);
		
	}
    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)=='('|| s.charAt(i)=='{'|| s.charAt(i)=='[') {
					push(s.charAt(i));
				}else if (!Isempty()&&
						(s.charAt(i)==')' && arr[top]=='(')||
						(s.charAt(i)=='}' && arr[top]=='{')||
						(s.charAt(i)==']' && arr[top]=='[')) {
					pop();
				}else {
					return false;
				}
		}
		return Isempty();
    }
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Validpar v= new Validpar();
		System.out.println("Enter The String ");
		String s1=in.nextLine();
		if (v.isValid(s1)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
