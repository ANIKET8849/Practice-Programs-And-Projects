#include<iostream>

using namespace std;

int main()
{
	int i;
	int j;
	
	i = 1;
	while(i <= 10)
	{
		cout << i << " ";
		++i;
	}
	
	cout << endl;
	j=15;
	do
	{
		cout << j << " ";
		++j;
	}while(j <= 10);
	
	cout << endl;
	for(int k=1; k<=10; k++)
		cout << k << " ";
	
	return 0;
}
