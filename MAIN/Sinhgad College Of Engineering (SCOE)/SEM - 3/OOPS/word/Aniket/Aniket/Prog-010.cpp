#include<iostream>

using namespace std;

int calculator(int, int, char);

int main()
{
	int no1, no2, sum, sub, mul;
	float div;
	
	cout << "Enter two numbers: ";
	cin >> no1 >> no2;
	
	sum = calculator(no1, no2, 'a');
	sub = calculator(no1, no2, 's');
	mul = calculator(no1, no2, 'm');
	div = calculator(no1, no2, 'd');
	
	cout << no1 << " + " << no2 << " = " << sum << endl;
	cout << no1 << " - " << no2 << " = " << sub << endl;
	cout << no1 << " x " << no2 << " = " << mul << endl;
	cout << no1 << " / " << no2 << " = " << div << endl;
	
	return 0;
}

int calculator(int n1, int n2, char option)
{
	if(option == 'a')
		return n1 + n2;
	else if(option == 's')
		return n1 - n2;
	else if(option == 'm')
		return n1 * n2;
	else
		return (float)n1 / n2;
}
