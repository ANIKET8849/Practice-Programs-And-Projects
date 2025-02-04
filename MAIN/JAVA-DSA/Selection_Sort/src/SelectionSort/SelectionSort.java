package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	void Selection(int[] arr) {
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = i+1; j <= arr.length-1; j++){
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length Of Array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter The Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		SelectionSort s =new SelectionSort();
		s.Selection(arr);

	}

}
