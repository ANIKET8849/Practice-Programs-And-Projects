package oops.com.org;

/* Create a class to print the area of a square and a rectangle. The class has
two methods with the same name but different number of parameters.
The method for printing area of rectangle has two parameters which are
length and breadth respectively while the other method for printing area
of square has one parameter which is side of square.*/

class Areas{
	
	public void area(float length,float breadth)
	{
		float arearect = length*breadth;
		System.out.println("The Area of Rectangle: "+arearect);
	}
	public void area(float side)
	{
		float areasqu =side*side;
		System.out.println("The Area of Square: "+areasqu);
	}
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areas as=new Areas();
		 as.area(67, 89);
		 as.area(67);

	}

}
