#include<iostream>
using namespace std;

int main(){
	int *p;
	int a=25;
	p=&a;

	cout<<"\nThe Value Of Integer : "<<a;
	cout<<"\nvalue of Integer : "<<*(&a);
	cout<<"\nThe Value Of Integer : "<<*p;
}
