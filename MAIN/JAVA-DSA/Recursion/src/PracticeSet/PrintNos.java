package PracticeSet;

public class PrintNos {

	void printNumbers(int n) {
		if (n>0) {
			printNumbers(n-1);
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		int n=5;
		PrintNos nos=new PrintNos();
		nos.printNumbers(n);

	}

}
