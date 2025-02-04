package oops.com.org;

/*Create a class named 'PrintNumber' to print various numbers of
different datatypes by creating different methods with the same name
'printn' having a parameter for each datatype. (Method Overloading).*/

class PrintNumber{
	
	public void Number( int num,int num2)
	{
		int add=num+num2;
		System.out.println("addition: "+add);
	}
	public void Number(String num3 ,int num4)
	{
		String add1=num3+num4;
		System.out.println("Substractiom: "+add1);
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber pn=new PrintNumber();
		pn.Number(12,45);
		pn.Number("Manisha",23);
	}

}
