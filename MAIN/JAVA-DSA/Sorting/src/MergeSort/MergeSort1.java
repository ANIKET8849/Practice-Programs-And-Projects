package MergeSort;

import java.util.Arrays;

public class MergeSort1 {

	int[] Merge2(int arr[]) {
		if (arr==null) {
			return arr;
		}
		if (arr.length>1) {
			int mid=arr.length/2;
			int left[]=new int[mid];
			for (int i = 0; i < mid; i++) {
				left[i]=arr[i];
			}
			
			int right[]=new int[arr.length- mid];
			for (int i = mid; i < arr.length; i++) {
				right[i- mid]=arr[i];
			}
			Merge2(left);
			Merge2(right);
			
			int i=0,j=0,k=0;
			
			while (i<left.length&&j<right.length) {
				if (left[i]<right[j]) {
					arr[k]=left[i];
					i++;
				}else {
					arr[k]=right[j];
					j++;
				}
				k++;
			}
			while (i<left.length) {
				arr[k]=left[i];
				i++;
				k++;
			}
			while (j<right.length) {
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int arr[]= {9,2,1,6,5,8,3,1,7,4};
		MergeSort1 mSort1=new MergeSort1();
		int ans[]=new int[arr.length];
		ans= mSort1.Merge2(arr);
		System.out.println(Arrays.toString(ans));

	}

}
