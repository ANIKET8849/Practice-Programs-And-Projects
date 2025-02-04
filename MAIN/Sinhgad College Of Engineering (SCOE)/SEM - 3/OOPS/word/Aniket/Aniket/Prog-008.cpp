#include<iostream>

using namespace std;

void calSum();

int main()
{
	calSum();
	return 0;
}

void calSum()
{
	int no1, no2, sum;
	
	cout << "Enter two numbers: ";
	cin >> no1 >> no2;
	
	sum = no1 + no2;
	
	cout << no1 << " + " << no2 << " = " << sum;
}
