#include<iostream>
#include<cmath>
using namespace std;

int main(){
	int n,n1,n2,n3,s=0,d,i=0;
	cout<<"Enter Any Number :  ";
	cin>>n;
	n1=n;
	n2=n;
	while(n1!=0){
		d=n1%10;
		n1=n1/10;
		i++;
	}
	while(n2!=0){
		d=n2%10;
		n3=pow(d , i);
		s=s+n3;
		n2=n2/10;
	}
	
	if(n==s){
		cout<<"The String Is Amstrong";
	}
	else{
		cout<<"The String Is Not Amstrong";
	}
}