package structures;

public class Nestedif {

	public static void main(String[] args) {
		int num1=70;
		int num2=60;
		int num3=50;
		
		if(num1>num2)
		{
			if(num1>num3) {
				System.out.println("The greater number is "+num1);
			}
			else {
				System.out.println("The greater number is "+num3);
			}
		}
		else {
			if(num2>num3) {
				System.out.println("The greater number is "+num2);
			}
			else {
				System.out.println("The greater number is "+num3);
			}
		}

	}

}
