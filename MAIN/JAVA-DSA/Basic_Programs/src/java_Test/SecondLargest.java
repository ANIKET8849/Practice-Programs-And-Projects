package java_Test;

import java.util.ArrayList;

public class SecondLargest {
	
	public void secondlarge(int arr[]) {
		int large=0,secondlarge=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>large) {
				secondlarge=large;
				large=arr[i];
				
			} else if (arr[i]<large && arr[i]>secondlarge) {
				secondlarge=arr[i];
			} 
		}
		System.out.println(secondlarge);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		SecondLargest sLargest=new SecondLargest();
		sLargest.secondlarge(arr);
	}

}
