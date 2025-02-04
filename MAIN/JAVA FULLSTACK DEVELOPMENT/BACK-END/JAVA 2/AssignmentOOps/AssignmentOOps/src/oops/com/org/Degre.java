package oops.com.org;

/*Create a class 'Degree' having a method 'getDegree' that prints "I got a
degree". It has two subclasses namely 'Undergraduate' and
'Postgraduate' each having a method with the same name that prints "I
am an Undergraduate" and "I am a Postgraduate" respectively. Call the
method by creating an object of each of the three classes*/

class Degree{
	
	public void getDegree()
	{
		System.out.println("I got a degree");
	}

	
}
class Undergraduate extends Degree{
	
	public void  graduate()
	{
		System.out.println("I am an Undergraduate");
	}
}
class Postgraduate extends Degree{
	
	public void  graduate()
	{
		System.out.println("I am an Postgraduate");
	}
}


public class Degre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postgraduate dg=new Postgraduate();
		dg.getDegree();
		dg.graduate();
		Undergraduate ug=new Undergraduate();
		dg.graduate();
	
		
	}

}
