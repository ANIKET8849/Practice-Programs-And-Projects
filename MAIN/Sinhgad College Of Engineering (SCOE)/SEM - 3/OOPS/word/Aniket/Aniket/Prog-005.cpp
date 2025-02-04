#include<iostream>

using namespace std;

int main()
{
	int no1 = 10, no2 = 0;
	bool no3;
	
	if(! no1 >= 5)
		cout << "Hi" << endl;
	else
		cout << "Hello" << endl;
		
	no3 = no1 || no2;
	
	cout << no3;
		
	return 0;
}
