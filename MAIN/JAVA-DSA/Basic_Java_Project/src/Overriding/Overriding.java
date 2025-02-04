package Overriding;

public class Overriding {

	void one() {
		System.out.println("one");
	}
}
class one{
	void one() {
		System.out.println("one1");
	}
}
class two{
	void one() {
		System.out.println("one1");
	}
	public static void main(String[] args) {
		two t = new two();
		one o =new one();
		o.one();
		t.one();
		
	}
}
