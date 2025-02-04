#include<iostream>
using namespace std;

int main(){
	int c=1,n,r;
	cout<<" Enter The Number : "<<endl;
	cin>>n;
	while(c<=10){
		r=c*n;
		cout<<r<<endl;
		c++;
	}
	return 0;
}