package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
 
	void bubble(int[] arr) {
		int count=0;
		boolean flag=true;
		while (flag) {
			flag=false;
			//Down Bubble Sort
			for (int i = 0; i <arr.length-1; i++) {
				if (arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
			//Up Bubble Sort
			for (int i = arr.length-1; i >0; i--) {
				if (arr[i]<arr[i-1]) {
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					flag=true;
				}
			}
			count++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Size Of Array : ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter The Elements To Add In Array : ");
		for (int i = 0; i < n; i++) {
			arr[i]=in.nextInt();
		}
		BubbleSort b =new BubbleSort();
		b.bubble(arr);

	}

}
