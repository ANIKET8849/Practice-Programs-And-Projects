#include<iostream>
using namespace std;

int main(){
	int a=0,b=1,c=0;
	cout<<a<<"   "<<b<<"   ";
	while(c<21){
		c=a+b;
		a=b;
		b=c;
		cout<<c<<"  ";		
	}
}