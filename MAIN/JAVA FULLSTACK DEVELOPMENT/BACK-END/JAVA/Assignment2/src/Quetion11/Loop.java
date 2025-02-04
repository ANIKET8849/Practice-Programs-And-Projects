package Quetion11;

public class Loop {

	public static void main(String[] args) {
		int count=1;
		 System.out.printf("N\t10*N\t100*N\t1000*N\n\n", count, count*10,
		count*100, count*1000); 
		 for (count=1; count<=5;count++){ 
		 System.out.printf("%d\t%d\t%d\t%d\n", count, count*10, count*100,
		count*1000); 
		 } 

	}

}
