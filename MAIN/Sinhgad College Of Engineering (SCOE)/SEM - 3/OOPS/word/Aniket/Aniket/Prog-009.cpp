#include<iostream>

using namespace std;

void calSum(int &, int &);

int main()
{
	int no1, no2;
	
	cout << "Enter two numbers: ";
	cin >> no1 >> no2;
	
	calSum(no1, no2);
	cout << no1 << " " << no2;
	return 0;
}



void calSum(int &n1, int &n2)
{
	int sum;
	n1 = 100;
	n2 = 200;
	sum = n1 + n2;
	cout << n1 << " + " << n2 << " = " << sum << endl;
}
