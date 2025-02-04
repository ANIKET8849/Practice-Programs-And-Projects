package java_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadArrayList {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> list =new ArrayList<>();
		System.out.println("Enter The No. Of Inputs You Want To Store : ");
		int n= in.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter No You Want Add : ");
			int a=in.nextInt();
			list.add(a);
		}
		System.out.println(list);

	}

}
