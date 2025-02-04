#include<iostream>
using namespace std;

int main(){
	int a,b;
	cout<<" Enter first Number : "<<endl;
	cin>>a;
	cout<<" Enter Second Number : "<<endl;
	cin>>b;
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<a<<"   "<<b;
}