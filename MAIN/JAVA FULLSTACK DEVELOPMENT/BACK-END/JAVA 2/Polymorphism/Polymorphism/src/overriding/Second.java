package overriding;

public class Second extends First{

	public void name() {
		System.out.println("Mayuri");
		super.name();
	}
	
	public static void main(String[] args) {
		
		Second s=new Second();
		s.name();
	}

}
