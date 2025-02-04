#include<iostream>
using namespace std;

int main(){
	int n,d,n1,r=0;
	cout<<" Enter Any Number : "<<endl;
	cin>>n;
	n1=n;
	while(n>0){
		d=n%10;
		r=(r*10)+d;
		n=n/10;
	}
	cout<<" The Reverse Is : "<<r<<endl;
	if(r==n1){
		cout<<" The Number Is Palidrome : "<<endl;
	}
	else{
		cout<<" The Number Is Not A Palidrome : "<<endl;
	}
}