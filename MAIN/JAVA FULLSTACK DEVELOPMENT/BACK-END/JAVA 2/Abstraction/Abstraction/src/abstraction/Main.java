package abstraction;

public class Main {

	public static void main(String[] args) {
		Bike b=new Bike();
		Car c=new Car();
		
		b.wheels();
		c.wheels();
		
		b.printName();
		c.printName();

	}

}
