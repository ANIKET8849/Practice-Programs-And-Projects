package BasicProg;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter The Marks Of Five Subjects : ");
		
		int s1=scanner.nextInt();
		int s2=scanner.nextInt();
		int s3=scanner.nextInt();
		int s4=scanner.nextInt();
		int s5=scanner.nextInt();
		
		double total=s1+s2+s3+s4+s5;
		int average=(int) (total/5);
		double percentage=(total/500)*100;
		System.out.println(total+" "+average+" "+percentage);
	}

}
