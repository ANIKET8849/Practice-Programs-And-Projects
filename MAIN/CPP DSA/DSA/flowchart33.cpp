#include<iostream>
#include<cmath>
using namespace std;

int main(){
	int n,d,cnt=0,b=2,p=3,r,s=0;
	cout<<" Enter Any Number : "<<endl;
	cin>>n;
	int n1=n;
	int n2=n;
		while(n>0){
			d=n%10;
			cnt++;
			n=n/10;
		}
	cout<<"The Digits Is : "<<cnt<<endl;
		while(n1>0){
			d=n1%10;
			s=s+pow(d,cnt);
			n1=n1/10;
		}
		cout<<" The Sum Of Digits : "<<s<<endl;
		if(n2==s){
			cout<<" The Number Is Armstrong Number : "<<endl;
		}
		else{
			cout<<" The Number Is Not An Armstrong Number : "<<endl;
		}
}