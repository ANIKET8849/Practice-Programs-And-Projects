#include<iostream>

using namespace std;

void calculator(int, int, int *, int *, int *, float *);

int main()
{
	int no1, no2, sum, sub, mul;
	float div;
	
	cout << "Enter two numbers: ";
	cin >> no1 >> no2;
	
	calculator(no1, no2, &sum, &sub, &mul, &div);
	
	cout << no1 << " + " << no2 << " = " << sum << endl;
	cout << no1 << " - " << no2 << " = " << sub << endl;
	cout << no1 << " x " << no2 << " = " << mul << endl;
	cout << no1 << " / " << no2 << " = " << div << endl;
	
	return 0;
}

void calculator(int n1, int n2, int *add, int *sub, int *mul, float *div)
{
	*add = n1 + n2;
	*sub = n1 - n2;
	*mul = n1 * n2;
	*div = (float)n1 / n2;
}
