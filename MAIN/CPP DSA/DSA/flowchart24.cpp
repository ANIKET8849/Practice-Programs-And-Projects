#include<iostream>
using namespace std;

int main(){
	int n,s=0,d,rev=0;
	cout<<" Enter Any Number :  "<<endl;
	cin>>n;
	while(n>0){
		d=n%10;
		rev=(rev*10)+d;
		n=n/10;
	}
	cout<<"Reverse Number Is : "<<rev;
}
