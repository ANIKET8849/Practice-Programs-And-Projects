#include<iostream>
using namespace std;

int main(){
	int c,max,n;
	cout<<" Enter Any Number : "<<endl;
	cin>>n;
	max=n;
	for(c=1; c<=9; c++){
	cout<<" Enter Any Number : "<<endl;
	cin>>n;
		if(n>max){
			max=n;
		}
	}
	cout<<max;
}