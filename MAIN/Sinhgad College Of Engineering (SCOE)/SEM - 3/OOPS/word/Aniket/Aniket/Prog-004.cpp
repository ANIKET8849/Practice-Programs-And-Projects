#include<iostream>

using namespace std;

int main()
{
	int no1, no2, no3;
	
	cout << "Enter three numbers: ";
	cin >> no1 >> no2 >> no3;
	
//	if(no1 >= no2)
//	{
//		if(no1 >= no3)
//			cout << no1 << " is maximum number";
//		else
//			cout << no3 << " is maximum number";
//	}
//	else
//	{
//		if(no2 >= no3)
//			cout << no2 << " is maximum number";
//		else
//			cout << no3 << " is maximum number";
//	}

	if(no1 >= no2 && no1 >= no3)
		cout << no1 << " is maximum number";
	else if(no2 >= no1 && no2 >= no3) 
		cout << no2 << " is maximum number";
	else 
		cout << no3 << " is maximum number";
		
	return 0;
}
