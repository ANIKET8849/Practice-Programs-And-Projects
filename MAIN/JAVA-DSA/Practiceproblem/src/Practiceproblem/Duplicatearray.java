package Practiceproblem;

import java.util.Scanner;

public class Duplicatearray {

	 public int removeDuplicates(int[] nums) {
		 int i,j=0;
		 if (nums.length<0) {
				System.out.println("Enter Valid String: ");
			}
		 for(i=0; i<nums.length-1; i++) {
				 if (nums[i]!=nums[i+1]) {
					nums[j++]=nums[i];
				 }	 
		 }
		 nums[j++]=nums[nums.length-1];
		 for (int j2 = 0; j2 < j; j2++) {
			 System.out.print(nums[j2]+" ");
		}
		return j;
	        
	    }
	 public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		Duplicatearray d =new Duplicatearray();
		System.out.println("Enter The Length Of Array You Want To Enter : ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter The Elements you Want To Add : ");
		for (int i = 0; i < n; i++) {
			arr[i]=in.nextInt();
		}
		d.removeDuplicates(arr);
	 
	 }
}
