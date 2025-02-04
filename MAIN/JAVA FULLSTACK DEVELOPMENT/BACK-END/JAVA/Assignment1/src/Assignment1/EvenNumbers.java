package Assignment1;

public class EvenNumbers {
	
	public static void main(String[] args) {
		int num = 121;
		do {
			
			if(num % 2 == 0) {
				System.out.println("The Number Is  "+num);
			}
			num++;
		}
		while(num <= 229);
		
	}
}
