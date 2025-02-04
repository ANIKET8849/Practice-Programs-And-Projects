package java_Test;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
