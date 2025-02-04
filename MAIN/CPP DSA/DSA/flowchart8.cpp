#include<iostream>
using namespace std;

int main(){
	int h,m,s;
	cout<<" Enter Hours : "<<endl;
	cin>>h;
	cout<<" Enter Second minutes : "<<endl;
	cin>>m;
	cout<<" Enter Second Seconds : "<<endl;
	cin>>s;
	int r=s+(m*60)+(h*60*60);	
	cout<<r;
}