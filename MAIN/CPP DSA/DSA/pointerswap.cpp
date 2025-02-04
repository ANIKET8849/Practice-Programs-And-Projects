#include<iostream>
using namespace std;

int main(){
	int *p,*q;
	int a=2,b=4,c;
	cout<<"\nThe Value Of Integer : "<<a;
	cout<<"\nThe Value Of Integer : "<<b;
	p=&a;
	q=&b;
	c=*p;
	*p=*q;
	*q=c;
	cout<<"\nThe Value Of Integer : "<<*p;
	cout<<"\nThe Value Of Integer : "<<*q;
	cout<<"\nThe Value Of Integer : "<<a;
	cout<<"\nThe Value Of Integer : "<<b;
}