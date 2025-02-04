package methods;

public class Main {
	
	public void Sum() {
		int a=10,b=20;
		System.out.println(a+b);
		
		PrintName obj=new PrintName();
		obj.Name();
	}
	public static void main(String[] args) {		
		Main m=new Main();
		m.Sum();
	}
}
