#include<iostream>
using namespace std;

int main(){
	int n,c=2,r;
	cout<<"Enter Any Number : ";
	cin>>n;
	cout<<endl<<" Divisible By : "<<endl;
	while(c<=n){
	r=n%c;
		if(r==0){
			cout<<c<<endl;
		}
	
	c++;
	}
}