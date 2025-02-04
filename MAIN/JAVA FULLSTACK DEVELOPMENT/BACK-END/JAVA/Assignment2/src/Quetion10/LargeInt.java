package Quetion10;
import java.util.*;
public class LargeInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in); 
		 int count, num, large = 0; 
		 
		 for (count=0; count<10;count++){ 
		 System.out.printf("Enter Number [%d]: ", count+1);
		 num=sc.nextInt();
		 large=large>num?large:num; 
		 }
		 
		 System.out.printf("Largest Number Is = %d", large);

	}

}
