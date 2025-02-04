#include<iostream>

using namespace std;

int main()
{
	int no1, no2, sum, sub, mul, choice;
	float div;
	
	cout << "Enter two numbers: ";
	cin >> no1 >> no2;
	
	cout << endl << endl <<"**********MENU**********" << endl << endl;	
	cout << "1. Addition" << endl;
	cout << "2. Subtraction" << endl;
	cout << "3. Multiplication" << endl;
	cout << "4. Division" << endl << endl << endl;
	
	cout << "Enter your choice: ";
	cin >> choice;
	
	switch(choice)
	{
		case 1:
			sum = no1 + no2;
			cout << no1 << " + " << no2 << " = " << sum;
			break;
		case 2:
			sub = no1 - no2;
			cout << no1 << " - " << no2 << " = " << sub;
			break;
		case 3:
			mul = no1 * no2;
			cout << no1 << " x " << no2 << " = " << mul;
			break;
		case 4:
			div = (float)no1 / no2;
			cout << no1 << " / " << no2 << " = " << div;
			break;
		default:
			cout << endl << endl << "INVALID CHOICE";
	}
}
