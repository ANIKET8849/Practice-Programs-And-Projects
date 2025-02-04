#include<iostream>
using namespace std;

int main(){
	int b,p,r=1,c=1;
	cout<<"Enter The Base Value : ";
	cin>>b;
	cout<<"Enter The Power Value : ";
	cin>>p;
	while(c<=p){
		r=r*b;
		c++;
	}
	cout<<r<<"  ";
}