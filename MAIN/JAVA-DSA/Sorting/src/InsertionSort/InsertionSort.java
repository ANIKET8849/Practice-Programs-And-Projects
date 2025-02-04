package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
	
	void Insertion(int arr[]) {
		 int  arr2[]=new int[10];
		 arr2[0]=arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];
	            int j = i - 1;
	           

	            while (j >= 0 && arr2[j] > key) {
	                arr2[j + 1] = arr2[j];
	                j--;
	            }
	            arr2[j + 1] = key;
	        }
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		int arr[]= {5,3,9,10,6,7,8,4,2,10};
		InsertionSort iSort=new InsertionSort();
		iSort.Insertion(arr);
	}

}
