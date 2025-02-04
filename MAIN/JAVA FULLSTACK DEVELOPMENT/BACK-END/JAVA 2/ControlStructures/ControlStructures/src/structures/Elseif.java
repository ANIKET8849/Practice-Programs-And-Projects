package structures;

public class Elseif {

	public static void main(String[] args) {
		int marks=25;
		
		if(marks>=75) {
			System.out.println("A Grade");
		}
		else if(marks>=60) {
			System.out.println("B Grade");
		}
		else if(marks>=45) {
			System.out.println("C Grade");
		}
		else if(marks>=35) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("You are Fail!");
		}
	}

}
