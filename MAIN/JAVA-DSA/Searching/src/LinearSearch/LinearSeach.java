package LinearSearch;

import java.util.Scanner;

public class LinearSeach {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int arr[]= {1,2,3,4,5,6};
		Boolean flag =false;
		System.out.println("Enter Element To Search :");
		int target=in.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (target==arr[i]) {
				flag=true;
				System.out.println("Element Is Found At Position : "+i);
			}
		}
		if (flag==true) {
			System.out.println("");
		} else {
			System.out.println("Element Is Not Found ");
		}
	}

}
