package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
	
	public void BinarySearch(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		
		boolean flag=false;
		while (low<=high) {
			int mid=(low+high)/2;
			if (arr[mid]==target) {
				flag = true;
				System.out.println("The Element "+arr[mid]+" Is Found At Position : "+mid);
				break;
			}else if (arr[mid]<high) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if (flag==false) {
			System.out.println("Element Is Not Found ");
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Length Of An Array : ");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter The Elements  : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter The Element You Want To Search : ");
		int t=in.nextInt();
		BinarySearch b =new BinarySearch();
		b.BinarySearch(arr, t);

	}

}
