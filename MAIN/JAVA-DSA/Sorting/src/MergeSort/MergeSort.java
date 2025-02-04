package MergeSort;

import java.util.Arrays;

public class MergeSort {
	
	void Merge(int[] arr,int arr1[]) {
		boolean flag=true;
		int arr3[]=new int[10];
		while (flag) {
			flag=false;
			
			for (int i = 0; i <arr.length-1; i++) {
				if (arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
			for (int i = 0; i <arr1.length-1; i++) {
				if (arr1[i]>arr1[i+1]) {
					int temp=arr1[i];
					arr1[i]=arr1[i+1];
					arr1[i+1]=temp;
					flag=true;
				}
			}
			
			int i=0,j=0,k=0;
			while (i<arr.length&&j<arr1.length) {
				if (arr[i]<arr1[j]) {
					arr3[k]=arr[i];
					i++;
				}else {
					arr3[k]=arr1[j];
					j++;
				}
				k++;
			}
			while (i<arr.length) {
				arr3[k]=arr[i];
				i++;
				k++;
			}
			while (j<arr1.length) {
				arr3[k]=arr1[j];
				j++;
				k++;
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

	public static void main(String[] args) {
		MergeSort mSort= new MergeSort();
		int arr[]= {9,2,1,6,5};
		int arr1[]= {8,3,1,7,4};
		mSort.Merge(arr, arr1);

	}

}
