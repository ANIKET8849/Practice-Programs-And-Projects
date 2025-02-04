#include<iostream>
using namespace std;

int main(){
	int term , n=1,s=0;
	cout<<"Enter Term you Want To Add : ";
	cin>>term;
	
	while(n<=term){
		s=s+n;
		n=n+1;
	}
	cout<<"The Sum Is : "<<s;
	
	
	
}