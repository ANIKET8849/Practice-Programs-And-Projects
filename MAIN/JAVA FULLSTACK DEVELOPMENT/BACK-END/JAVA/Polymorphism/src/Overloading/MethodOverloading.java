package Overloading;

public class MethodOverloading {
	
	public void name() {
		System.out.println("Aniket");
	}

	public void name(String name2) {
		System.out.println(name2);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.name();
		m.name("Gholap");

	}

}
