#include<iostream>
using namespace std;

int main(){
	int n,d1,d2,s;
	cout<<" Enter Number : "<<endl;
	cin>>n;
	d1=	n%10;
	d2=(n-d1)/10;
	s=d1+d2;
	cout<<s;
}