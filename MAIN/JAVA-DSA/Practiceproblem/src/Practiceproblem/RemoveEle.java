package Practiceproblem;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEle {
	 public int removeElement(int[] nums, int val) {
		 int j=1,k=0;
		 for (int i = 0; i < nums.length; i++) {
			if (nums[i]==val) {
				int temp =nums[nums.length-j];
			nums[i]=nums[nums.length-j];
			nums[nums.length-j]=-1;
				j++;
			}else {
				nums[k]=nums[i];
				k++;
			}
				
		}
		 
		 System.out.println(k);
		 System.out.print(nums);
	        return 0;
	    }

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int[] nums;
		int val;
		System.out.println("Enter The length of Array");
		int n=in.nextInt();
		nums=new int[n];
		System.out.println("Enter array Elements : ");
		for (int i = 0; i < n; i++) {
			nums[i]=in.nextInt();
		}
		System.out.println("Enter The Value To Be Found :");
		val=in.nextInt();
		RemoveEle r =new RemoveEle();
		r.removeElement(nums, val);
	}

}
