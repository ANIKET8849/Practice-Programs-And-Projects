package oops.com.org;

import java.util.Scanner;

/*. Create a class named pizza that have the variables to store the size of
pizza, number of cheese toppings, number of pepperoni toppings and
number of ham toppings.
Pizza cost id determined by:
Small: 299/-
Medium: 499/-
Large: 699/-
Cheese Toppings: 10/-
Pepperoni Toppings: 10/-
Ham Toppings: 10/-
Write a public method ‘getDescription()’ that will return the exact total
cost of the Pizza.*/

class Pizzas{
	String Pizza_Size;
	int Ches_topp;
	int Pepp_topp;
	int ham_topp;
	

public Pizzas(String Pizza_Size1, int Ches_topp1,int Pepp_topp1,int ham_topp1)
{
	this.Pizza_Size=Pizza_Size1;
	this.Ches_topp=Ches_topp1;
	this.Pepp_topp=Pepp_topp1;
	this.ham_topp=ham_topp1;
}

public int PizzaCalculate()
{
	int totalcost=0;
	
	int topcost=10*(Ches_topp+Pepp_topp+ham_topp);
	
	if(Pizza_Size=="Small")
	
		totalcost=299+topcost;
	
	else if(Pizza_Size=="Medium")
	
		totalcost=499+topcost;
	
	else if(Pizza_Size=="Large")
	
		totalcost=699+topcost;
	else
		totalcost=899+topcost;

	return totalcost;

	
}
public String getDescription()
{
	int cost=PizzaCalculate();
	
	String PizzaDescp="Size: "+Pizza_Size  + "Cheese Toppings: "+Ches_topp +"Pepperoni Toppings:"+Pepp_topp +"Ham Toppings:" +ham_topp +"Total Prize:" +cost;
	return PizzaDescp;
	
}

}
public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Pizza order Details:");
 
 System.out.println("Enter the Pizza Size(Small,Medium,Large)");
 String pizza_size=sc.next();
 
 System.out.println("Enter the Cheese Toppings Number:");
 int Ches_topp1=sc.nextInt();
 
 System.out.println("Enter the Pepperoni Toppings Number:");
 int Pepp_topp1=sc.nextInt();
 
 System.out.println("Enter the Ham Toppings Number:");
 int ham_topp1=sc.nextInt();
 
		Pizzas ps=new Pizzas(pizza_size,Ches_topp1,Pepp_topp1,ham_topp1);
		String descp=ps.getDescription();
		System.out.println(descp);
	}

}
