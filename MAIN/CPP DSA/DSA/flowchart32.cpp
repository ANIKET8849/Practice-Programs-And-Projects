#include<iostream>
using namespace std;

int main(){
	int n,d,cnt=0;
	cout<<" Enter Any Number : "<<endl;
	cin>>n;
		while(n>0){
			d=n%10;
			cnt++;
			n=n/10;
		}
	cout<<"The Digits Is : "<<cnt;
}