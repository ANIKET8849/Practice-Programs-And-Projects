package BasicProg;


import java.util.Scanner;

public class RadiusOfCircle {
	
	public void Circle(int r) {
		int diameter=2*r;
		double circumfarence=2*Math.PI*r;
		double area= Math.PI*Math.pow(r, 2);
		
		
		System.out.println("The Diameter is "+diameter);
		System.out.println("The Circumference Of Circle Is : "+circumfarence);
		System.out.println("The Area Of Circle Is : "+area);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Radius Of Circle : ");
		int r=sc.nextInt();
		RadiusOfCircle radiusOfCircle=new RadiusOfCircle();
		radiusOfCircle.Circle(r);

	}

}
