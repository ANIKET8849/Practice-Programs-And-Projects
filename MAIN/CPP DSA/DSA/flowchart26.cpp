#include<iostream>
using namespace std;

int main(){
	int c,min,n;
	cout<<" Enter Any Number : "<<endl;
	cin>>n;
	min=n;
	for(c=1; c<=9; c++){
	cout<<" Enter Any Number : "<<endl;
	cin>>n;
		if(n<min){
			min=n;
		}
	}
	cout<<min;
}